# teamcity-aws-core-plugin 
 
# Bad smells
I found 137 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| Deprecation | 70 | false |
| SpringBeanConstructorArgInspection | 18 | false |
| SpringXmlModelInspection | 10 | false |
| DeprecatedIsStillUsed | 5 | false |
| UNCHECKED_WARNING | 4 | false |
| JavadocDeclaration | 4 | false |
| JavadocReference | 3 | false |
| SpringXmlAutowireExplicitlyInspection | 3 | false |
| DuplicatedCode | 2 | false |
| StringBufferReplaceableByString | 2 | false |
| ArraysAsListWithZeroOrOneArgument | 2 | false |
| ConstantValue | 2 | false |
| RedundantCast | 1 | false |
| UnnecessaryCallToStringValueOf | 1 | false |
| RedundantCollectionOperation | 1 | false |
| RedundantStringFormatCall | 1 | false |
| PointlessNullCheck | 1 | false |
| ManualMinMaxCalculation | 1 | false |
| RedundantTypeArguments | 1 | false |
| MismatchedStringBuilderQueryUpdate | 1 | false |
| UnusedAssignment | 1 | false |
| NullableProblems | 1 | false |
| FieldCanBeLocal | 1 | false |
| IgnoreResultOfCall | 1 | false |
## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.ArrayList' to 'java.util.List'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/iamRoleType/IamRoleCredentialsBuilder.java`
#### Snippet
```java
    ChosenAwsConnPropertiesProcessor chosenAwsConnPropertiesProcessor = new ChosenAwsConnPropertiesProcessor();
    List<InvalidProperty> invalidProperties =
      new ArrayList<>(chosenAwsConnPropertiesProcessor.process(properties));

    String invalidArnReason = getInvalidArnReason(properties.get(IAM_ROLE_ARN_PARAM));
```

### UNCHECKED_WARNING
Unchecked call to 'ArrayList(Collection)' as a member of raw type 'java.util.ArrayList'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/iamRoleType/IamRoleCredentialsBuilder.java`
#### Snippet
```java
    ChosenAwsConnPropertiesProcessor chosenAwsConnPropertiesProcessor = new ChosenAwsConnPropertiesProcessor();
    List<InvalidProperty> invalidProperties =
      new ArrayList<>(chosenAwsConnPropertiesProcessor.process(properties));

    String invalidArnReason = getInvalidArnReason(properties.get(IAM_ROLE_ARN_PARAM));
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/keyRotation/impl/AwsRotateKeyApi.java`
#### Snippet
```java
    }

    Map<String, String> newParameters = new HashMap<>(currentConnection.getParameters());
    newParameters.put(AwsAccessKeysParams.ACCESS_KEY_ID_PARAM, myNewCredentials.getCredentials().getAWSAccessKeyId());
    newParameters.put(AwsAccessKeysParams.SECURE_SECRET_ACCESS_KEY_PARAM, myNewCredentials.getCredentials().getAWSSecretKey());
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java
    AwsCredentialsBuilder credentialsBuilder = getAwsCredentialsBuilderOfType(credentialsType);

    Map<String, String> paramsWithSessionDuration = new HashMap<>(featureDescriptor.getParameters());
    paramsWithSessionDuration.put(AwsSessionCredentialsParams.SESSION_DURATION_PARAM, sessionDuration);
    return credentialsBuilder.constructSpecificCredentialsProvider(
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `RemoteArtifactMessage`
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/ami/AMIArtifactMessage.java`
#### Snippet
```java
   * @param connectionId         - ID of AWS connection that can be used to access that AMI
   * @param connectionParameters - additional parameters that are needed to use specified AWS connection(session duration etc.)
   * @return - {#{@link RemoteArtifactMessage}} of specific type that describes an EC2 AMI
   */
  @NotNull
```

### JavadocReference
Cannot resolve symbol `buildAwsCredentialsProvider(Map)`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsBuilder.java`
#### Snippet
```java
   * <p>
   * <b>Do not use this method directly</b>,
   * instead, call the {@link jetbrains.buildServer.clouds.amazon.connector.AwsConnectorFactory#buildAwsCredentialsProvider(Map) AwsConnectorFactory#buildAwsCredentialsProvider(connectionProperties)}
   * method, to ensure that the correct AwsCredentialsBuilder will be used to provide AWS credentials.
   *
```

### JavadocReference
Cannot resolve symbol `buildAwsCredentialsProvider(Map)`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsBuilder.java`
#### Snippet
```java
   * @param  featureDescriptor  Connection descriptor with properties Map of concrete AWS Connection.
   * @return AwsCredentialsHolder object with specified credentials type.
   * @see    jetbrains.buildServer.clouds.amazon.connector.AwsConnectorFactory#buildAwsCredentialsProvider(Map) buildAwsCredentialsProvider(connectionProperties).
   */
  @NotNull
```

## RuleId[id=RedundantCast]
### RedundantCast
Casting `createCallerIdentityElement(...)` to `Content` is redundant
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AwsTestConnectionController.java`
#### Snippet
```java
        );
        GetCallerIdentityResult getCallerIdentityResult = testConnectionResult.getGetCallerIdentityResult();
        xmlResponse.addContent((Content)createCallerIdentityElement(getCallerIdentityResult));
      } else {
        for (InvalidProperty invalidProp : invalidProperties) {
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
Class jetbrains.buildServer.clouds.amazon.connector.errors.AwsConnectorException is not a descendant of Throwable
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManager.java`
#### Snippet
```java
   * @param awsConnectionId - ID of the connection
   * @return {@link AwsConnectionDescriptor} containing information about connection that can be used to construct specific AWS clients or throws exception if no such connection can be found
   * @throws AwsConnectorException thrown when the AWS Connection credentials creation failed.
   */
  @NotNull
```

### JavadocDeclaration
Class jetbrains.buildServer.clouds.amazon.connector.errors.features.LinkedAwsConnNotFoundException is not a descendant of Throwable
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManager.java`
#### Snippet
```java
   * @param properties properties Map where should be the chosen AWS Connection ID parameter.
   * @return {@link AwsConnectionDescriptor} containing information about connection that can be used to construct specific AWS clients or throws exception if no such connection can be found
   * @throws LinkedAwsConnNotFoundException thrown when there is no corresponding {@link AwsCloudConnectorConstants#CHOSEN_AWS_CONN_ID_PARAM property} in the properties map,
   *                                        when there is no AWS Connection with specified ID or when the AWS Connection credentials creation failed.
   */
```

### JavadocDeclaration
Class jetbrains.buildServer.clouds.amazon.connector.errors.features.LinkedAwsConnNotFoundException is not a descendant of Throwable
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManager.java`
#### Snippet
```java
   * @param project    project which will be searched for the AWS Connection.
   * @return AwsConnectionBean data bean with all AWS Connection properties.
   * @throws LinkedAwsConnNotFoundException thrown when there is no corresponding {@link AwsCloudConnectorConstants#CHOSEN_AWS_CONN_ID_PARAM property} in the properties map,
   *                                        when there is no AWS Connection with specified ID or when the AWS Connection credentials creation failed.
   */
```

### JavadocDeclaration
`@param params` tag description is missing
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
  /**
   * Default region name will be returned if neither new nor old parameter is specified.
   * @param params
   * @return region name
   */
```

## RuleId[id=DeprecatedIsStillUsed]
### DeprecatedIsStillUsed
Deprecated member 'AWSClients' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSClients.java`
#### Snippet
```java
 */
@Deprecated
public class AWSClients {

  @Nullable private final AWSCredentials myCredentials;
```

### DeprecatedIsStillUsed
Deprecated member 'AWSRegions' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSRegions.java`
#### Snippet
```java
 */
@Deprecated
public final class AWSRegions {
  private static final Map<String, String> REGION_NAMES_FOR_WEB;

```

### DeprecatedIsStillUsed
Deprecated member 'AwsConnectionBean' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/dataBeans/AwsConnectionBean.java`
#### Snippet
```java

@Deprecated
public class AwsConnectionBean {
  private final String myConnectionId;
  private final String myDescription;
```

### DeprecatedIsStillUsed
Deprecated member 'getLinkedAwsConnection' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/AwsConnectionsManager.java`
#### Snippet
```java
  @NotNull
  @Deprecated
  AwsConnectionBean getLinkedAwsConnection(@NotNull final Map<String, String> properties, @NotNull final SProject project) throws LinkedAwsConnNotFoundException;

  /**
```

### DeprecatedIsStillUsed
Deprecated member 'AWSCommonParams' is still used
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
 */
@Deprecated
public final class AWSCommonParams {

  // "codedeploy_" prefix is for backward compatibility
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'runner'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'codedeploy'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'CodeDeployRunType'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java
       default-autowire="constructor">

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'runner'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'codedeploy'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'CodeDeployBuildProblemTypes'
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
    <bean id="codeDeployBuildProblemTypes" class="jetbrains.buildServer.runner.codedeploy.CodeDeployBuildProblemTypes"/>
</beans>

```

## RuleId[id=UnnecessaryCallToStringValueOf]
### UnnecessaryCallToStringValueOf
Unnecessary `String.valueOf()` call
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/connectionId/AwsConnectionIdGenerator.java`
#### Snippet
```java

  public static String formatId(@NotNull final String connectionId, int newIdNumber) {
    return String.format("%s_%s", connectionId, String.valueOf(newIdNumber));
  }

```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsCredentialsHandler'#treeend

*** ** * ** ***

|-----------------------------------------------------------|---|-----------|
| **AwsCredentialsHandler(...):**                           |   | **Bean:** |
| EventDispatcher\<AgentLifeCycleListener\> agentDispatcher |   | **???**   |
in `aws-core-agent/src/main/resources/META-INF/build-agent-plugin-aws-core.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean class="jetbrains.buildServer.clouds.amazon.connector.AwsCredentialsHandler"/>
</beans>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsConnectionIdGenerator'#treeend

*** ** * ** ***

|---------------------------------------------------------|---|-------------------------------------------|
| **AwsConnectionIdGenerator(...):**                      |   | **Bean:**                                 |
| AwsConnectionsHolder awsConnectionsHolder               |   | Autowired: null(AwsConnectionsHolderImpl) |
| OAuthConnectionsIdGenerator OAuthConnectionsIdGenerator |   | **???**                                   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
<!--    ^-->

    <bean class="jetbrains.buildServer.clouds.amazon.connector.connectionId.AwsConnectionIdGenerator"/>

    <bean class="jetbrains.buildServer.clouds.amazon.connector.backwardsCompat.AwsConnectorExtensionRegistar"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsConnectorExtensionRegistar'#treeend

*** ** * ** ***

|---------------------------------------------------|---|--------------------------------------------|
| **AwsConnectorExtensionRegistar(...):**           |   | **Bean:**                                  |
| ExtensionHolder extensionHolder                   |   | **???**                                    |
| PluginDescriptor pluginDescriptor                 |   | **???**                                    |
| AwsConnectorFactory awsConnectorFactory           |   | Autowired: null(AwsConnectorFactoryImpl)   |
| AwsConnectionsManager awsConnectionsManager       |   | Autowired: null(AwsConnectionsManagerImpl) |
| AwsConnectionIdGenerator awsConnectionIdGenerator |   | Autowired: null(AwsConnectionIdGenerator)  |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.connectionId.AwsConnectionIdGenerator"/>

    <bean class="jetbrains.buildServer.clouds.amazon.connector.backwardsCompat.AwsConnectorExtensionRegistar"/>

<!--    core logic of aws connections-->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsConnectionDescriptorBuilderImpl'#treeend

*** ** * ** ***

|-------------------------------------------------|---|------------------------------------------|
| **AwsConnectionDescriptorBuilderImpl(...):**    |   | **Bean:**                                |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**                                  |
| AwsConnectorFactory awsConnectorFactory         |   | Autowired: null(AwsConnectorFactoryImpl) |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
<!--    core logic of aws connections-->
    <bean class="jetbrains.buildServer.clouds.amazon.connector.impl.AwsConnectorFactoryImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionDescriptorBuilderImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionsEventsListener"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionsHolderImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsConnectionsEventsListener'#treeend

*** ** * ** ***

|-------------------------------------------------------------------|---|-----------------------------------------------------|
| **AwsConnectionsEventsListener(...):**                            |   | **Bean:**                                           |
| AwsConnectionsHolder awsConnectionsHolder                         |   | Autowired: null(AwsConnectionsHolderImpl)           |
| AwsConnectionDescriptorBuilder awsConnectionDescriptorBuilder     |   | Autowired: null(AwsConnectionDescriptorBuilderImpl) |
| EventDispatcher\<BuildServerListener\> buildServerEventDispatcher |   | **???**                                             |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.impl.AwsConnectorFactoryImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionDescriptorBuilderImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionsEventsListener"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionsHolderImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsCredentialsRefresheringManager"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsConnectionsHolderImpl'#treeend

*** ** * ** ***

|---------------------------------------------------------------------|---|-----------------------------------------------------|
| **AwsConnectionsHolderImpl(...):**                                  |   | **Bean:**                                           |
| AwsConnectionDescriptorBuilder awsConnectionDescriptorBuilder       |   | Autowired: null(AwsConnectionDescriptorBuilderImpl) |
| ProjectManager projectManager                                       |   | **???**                                             |
| AwsCredentialsRefresheringManager awsCredentialsRefresheringManager |   | Autowired: null(AwsCredentialsRefresheringManager)  |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionDescriptorBuilderImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionsEventsListener"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsConnectionsHolderImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.common.impl.AwsCredentialsRefresheringManager"/>
<!--    ^-->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsConnectionCredentialsFactoryImpl'#treeend

*** ** * ** ***

|-----------------------------------------------|---|-----------|
| **AwsConnectionCredentialsFactoryImpl(...):** |   | **Bean:** |
| ExtensionHolder extensionHolder               |   | **???**   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
<!--    ^-->

    <bean class="jetbrains.buildServer.serverSide.connections.aws.impl.AwsConnectionCredentialsFactoryImpl"/>

    <bean class="jetbrains.buildServer.clouds.amazon.connector.impl.staticType.StaticCredentialsBuilder"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'LinkedAwsConnectionProviderImpl'#treeend

*** ** * ** ***

|-------------------------------------------------------------------------|---|-----------|
| **LinkedAwsConnectionProviderImpl(...):**                               |   | **Bean:** |
| ProjectManager projectManager                                           |   | **???**   |
| ProjectConnectionCredentialsManager projectConnectionCredentialsManager |   | **???**   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.impl.defaultProviderType.DefaultProviderCredentialsBuilder"/>

    <bean class="jetbrains.buildServer.clouds.amazon.connector.impl.LinkedAwsConnectionProviderImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.utils.clients.impl.BasicStsClientProviderImpl"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsExternalIdsManagerImpl'#treeend

*** ** * ** ***

|-------------------------------------|---|-----------|
| **AwsExternalIdsManagerImpl(...):** |   | **Bean:** |
| ProjectManager projectManager       |   | **???**   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.utils.clients.impl.BasicStsClientProviderImpl"/>

    <bean class="jetbrains.buildServer.clouds.amazon.connector.impl.iamRoleType.externalId.AwsExternalIdsManagerImpl"/>
    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AwsExternalIdsController"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsExternalIdsController'#treeend

*** ** * ** ***

|---------------------------------------------|---|--------------------------------------------|
| **AwsExternalIdsController(...):**          |   | **Bean:**                                  |
| SBuildServer server                         |   | **???**                                    |
| WebControllerManager webControllerManager   |   | **???**                                    |
| ProjectManager projectManager               |   | **???**                                    |
| AuthorizationInterceptor authInterceptor    |   | **???**                                    |
| AwsExternalIdsManager awsExternalIdsManager |   | Autowired: null(AwsExternalIdsManagerImpl) |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java

    <bean class="jetbrains.buildServer.clouds.amazon.connector.impl.iamRoleType.externalId.AwsExternalIdsManagerImpl"/>
    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AwsExternalIdsController"/>

    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AvailableAwsConnsController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AvailableAwsConnsController'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **AvailableAwsConnsController(...):**           |   | **Bean:** |
| SBuildServer server                             |   | **???**   |
| WebControllerManager webControllerManager       |   | **???**   |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**   |
| ProjectManager projectManager                   |   | **???**   |
| AuthorizationInterceptor authInterceptor        |   | **???**   |
| PluginDescriptor descriptor                     |   | **???**   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AwsExternalIdsController"/>

    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AvailableAwsConnsController"/>
    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AwsTestConnectionController"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsTestConnectionController'#treeend

*** ** * ** ***

|-------------------------------------------|---|------------------------------------------|
| **AwsTestConnectionController(...):**     |   | **Bean:**                                |
| SBuildServer server                       |   | **???**                                  |
| WebControllerManager webControllerManager |   | **???**                                  |
| AwsConnectionTester awsConnectionTester   |   | Autowired: null(AwsConnectionTesterImpl) |
| ProjectManager projectManager             |   | **???**                                  |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java

    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AvailableAwsConnsController"/>
    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AwsTestConnectionController"/>


```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsKeyRotatorImpl'#treeend

*** ** * ** ***

|-------------------------------------------------|---|---------------------------------|
| **AwsKeyRotatorImpl(...):**                     |   | **Bean:**                       |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**                         |
| SecurityContextEx securityContext               |   | **???**                         |
| ConfigActionFactory configActionFactory         |   | **???**                         |
| OldKeysCleaner oldKeysCleaner                   |   | Autowired: null(OldKeysCleaner) |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java


    <bean class="jetbrains.buildServer.clouds.amazon.connector.keyRotation.impl.AwsKeyRotatorImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.keyRotation.impl.OldKeysCleaner"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.utils.clients.impl.IamClientBuilderImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'OldKeysCleaner'#treeend

*** ** * ** ***

|-------------------------------------------------|---|---------------------------------------|
| **OldKeysCleaner(...):**                        |   | **Bean:**                             |
| MultiNodeTasks multiNodeTasks                   |   | **???**                               |
| ServerResponsibility serverResponsibility       |   | **???**                               |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**                               |
| ProjectManager projectManager                   |   | **???**                               |
| IamClientBuilder iamClientBuilder               |   | Autowired: null(IamClientBuilderImpl) |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java

    <bean class="jetbrains.buildServer.clouds.amazon.connector.keyRotation.impl.AwsKeyRotatorImpl"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.keyRotation.impl.OldKeysCleaner"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.utils.clients.impl.IamClientBuilderImpl"/>
    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AwsRotateKeysController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsRotateKeysController'#treeend

*** ** * ** ***

|-------------------------------------------|---|------------------------------------|
| **AwsRotateKeysController(...):**         |   | **Bean:**                          |
| SBuildServer server                       |   | **???**                            |
| WebControllerManager webControllerManager |   | **???**                            |
| ProjectManager projectManager             |   | **???**                            |
| AuthorizationInterceptor authInterceptor  |   | **???**                            |
| AwsKeyRotator awsKeyRotator               |   | Autowired: null(AwsKeyRotatorImpl) |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.keyRotation.impl.OldKeysCleaner"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.utils.clients.impl.IamClientBuilderImpl"/>
    <bean class="jetbrains.buildServer.serverSide.oauth.aws.controllers.AwsRotateKeysController"/>
    <bean class="jetbrains.buildServer.clouds.amazon.ami.cleanup.EC2AmiCleanupExtension"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.utils.clients.EC2ClientCreator"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'DisabledAwsConnectionHealthReport'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **DisabledAwsConnectionHealthReport(...):**     |   | **Bean:** |
| OAuthConnectionsManager oAuthConnectionsManager |   | **???**   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.utils.clients.EC2ClientCreator"/>

    <bean class="jetbrains.buildServer.clouds.amazon.connector.health.DisabledAwsConnectionHealthReport"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.health.DisabledAwsConnectionHealthPage"/>
    <bean class="jetbrains.buildServer.serverSide.connections.aws.AwsConnectionSettingsMapper"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'DisabledAwsConnectionHealthPage'#treeend

*** ** * ** ***

|-------------------------------------------|---|-----------|
| **DisabledAwsConnectionHealthPage(...):** |   | **Bean:** |
| PluginDescriptor pluginDescriptor         |   | **???**   |
| PagePlaces pagePlaces                     |   | **???**   |
| ProjectManagerEx projectManager           |   | **???**   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java

    <bean class="jetbrains.buildServer.clouds.amazon.connector.health.DisabledAwsConnectionHealthReport"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.health.DisabledAwsConnectionHealthPage"/>
    <bean class="jetbrains.buildServer.serverSide.connections.aws.AwsConnectionSettingsMapper"/>
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsConnectionSettingsMapper'#treeend

*** ** * ** ***

|---------------------------------------|---|-----------|
| **AwsConnectionSettingsMapper(...):** |   | **Bean:** |
| ProjectManager projectManager         |   | **???**   |
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.connector.health.DisabledAwsConnectionHealthReport"/>
    <bean class="jetbrains.buildServer.clouds.amazon.connector.health.DisabledAwsConnectionHealthPage"/>
    <bean class="jetbrains.buildServer.serverSide.connections.aws.AwsConnectionSettingsMapper"/>
</beans>
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `aws-core-agent/src/main/resources/META-INF/build-agent-plugin-aws-core.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean class="jetbrains.buildServer.clouds.amazon.connector.AwsCredentialsHandler"/>
</beans>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `aws-core-server/teamcity-plugin.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

    <bean id="codeDeployRunnerRunType" class="jetbrains.buildServer.runner.codedeploy.CodeDeployRunType"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `aws-core-server/src/main/resources/META-INF/build-server-plugin-aws-core-plugin.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

<!--    open-api beans-->
```

## RuleId[id=RedundantCollectionOperation]
### RedundantCollectionOperation
`contains` can be replaced with 'Map.containsKey()'
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/parameters/regions/AWSRegions.java`
#### Snippet
```java
      return false;

    return CHINA_REGION_NAMES_FOR_WEB.keySet().contains(regionName);
  }
}
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSClients.java`
#### Snippet
```java
    if (myCredentials != null) {
      builder.withCredentials(new AWSStaticCredentialsProvider(myCredentials));
    }

    // null in myRegion will cause S3 client instantiation to fail
    // we ensure, that we have at least default region
    String region = myRegion;

    if (myRegion == null) {
      region = AwsCloudConnectorConstants.REGION_NAME_DEFAULT;
    }

    if (StringUtil.isNotEmpty(myServiceEndpoint)) {
      builder.withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(myServiceEndpoint, region));
    } else {
      builder.withRegion(region);
    }

    return builder.build();
```

### DuplicatedCode
Duplicated code
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java
    if (type == null) {
      String errMsg = "There is no credentials type property in the AWS Connection, cannot construct Credentials Provider of type null.";
      throw new NoSuchAwsCredentialsBuilderException(errMsg);
    }

    AwsCredentialsBuilder builder = myCredentialBuilders.get(type);
    if (builder == null) {
      String errMsg = "Failed to find registered AwsCredentialsBuilder for type " + type + ".";
      throw new NoSuchAwsCredentialsBuilderException(errMsg);
    }
    return builder;
```

## RuleId[id=StringBufferReplaceableByString]
### StringBufferReplaceableByString
`StringBuilder mergedIdsBuilder` can be replaced with 'String'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/keyRotation/impl/OldKeysCleaner.java`
#### Snippet
```java

    public Pair<String, String> toTaskArgs() {
      StringBuilder mergedIdsBuilder = new StringBuilder();
      mergedIdsBuilder.append(oldAccessKeyId); // the acces key ID will never have <TASK_ARG_DIVIDER> characters inside it
      mergedIdsBuilder.append(TASK_ARG_DIVIDER);
```

### StringBufferReplaceableByString
`StringBuilder mergedArgsBuilder` can be replaced with 'String'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/keyRotation/impl/OldKeysCleaner.java`
#### Snippet
```java
      mergedIdsBuilder.append(connectionId); // is user-configurable and can potentially have <TASK_ARG_DIVIDER> characters inside it

      StringBuilder mergedArgsBuilder = new StringBuilder();
      mergedArgsBuilder.append(keyDeletionTime); // the ZonedDateTime will never have <TASK_ARG_DIVIDER> characters inside it
      mergedArgsBuilder.append(TASK_ARG_DIVIDER);
```

## RuleId[id=Deprecation]
### Deprecation
Overrides deprecated method in 'jetbrains.buildServer.serverSide.BuildFeature'
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/credsToAgent/AwsConnToAgentBuildFeature.java`
#### Snippet
```java

  @Override
  public PropertiesProcessor getParametersProcessor() {
    return this;
  }
```

### Deprecation
'jetbrains.buildServer.clouds.amazon.connector.impl.dataBeans.AwsConnectionBean' is deprecated
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/ami/cleanup/EC2AmiCleanupExtension.java`
#### Snippet
```java

    return clientsCache.computeIfAbsent(connectionId, cid -> {
      final AwsConnectionBean awsConnection = myConnectionsManager.getAwsConnection(project, cid, connectionAttributes);

      if (awsConnection != null) {
```

### Deprecation
'getAwsConnection(SProject, java.lang.String, java.util.Map)' is deprecated
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/ami/cleanup/EC2AmiCleanupExtension.java`
#### Snippet
```java

    return clientsCache.computeIfAbsent(connectionId, cid -> {
      final AwsConnectionBean awsConnection = myConnectionsManager.getAwsConnection(project, cid, connectionAttributes);

      if (awsConnection != null) {
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    final Map<String, String> params = ((jetbrains.buildServer.controllers.BasePropertiesBean)request.getAttribute("propertiesBean")).getProperties();

    if (params.containsKey(AWSCommonParams.REGION_NAME_PARAM_OLD)) {
      params.put(AWSCommonParams.REGION_NAME_PARAM, params.get(AWSCommonParams.REGION_NAME_PARAM_OLD));
      params.remove(AWSCommonParams.REGION_NAME_PARAM_OLD);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.REGION_NAME_PARAM_OLD)) {
      params.put(AWSCommonParams.REGION_NAME_PARAM, params.get(AWSCommonParams.REGION_NAME_PARAM_OLD));
      params.remove(AWSCommonParams.REGION_NAME_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.REGION_NAME_PARAM_OLD)) {
      params.put(AWSCommonParams.REGION_NAME_PARAM, params.get(AWSCommonParams.REGION_NAME_PARAM_OLD));
      params.remove(AWSCommonParams.REGION_NAME_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    if (params.containsKey(AWSCommonParams.REGION_NAME_PARAM_OLD)) {
      params.put(AWSCommonParams.REGION_NAME_PARAM, params.get(AWSCommonParams.REGION_NAME_PARAM_OLD));
      params.remove(AWSCommonParams.REGION_NAME_PARAM_OLD);
    }

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    }

    if (params.containsKey(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD)) {
      String credentialsType = params.get(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD);
      if (AWSCommonParams.TEMP_CREDENTIALS_OPTION_OLD.equals(credentialsType)) {
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD)) {
      String credentialsType = params.get(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD);
      if (AWSCommonParams.TEMP_CREDENTIALS_OPTION_OLD.equals(credentialsType)) {
        credentialsType = AWSCommonParams.TEMP_CREDENTIALS_OPTION;
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    if (params.containsKey(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD)) {
      String credentialsType = params.get(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD);
      if (AWSCommonParams.TEMP_CREDENTIALS_OPTION_OLD.equals(credentialsType)) {
        credentialsType = AWSCommonParams.TEMP_CREDENTIALS_OPTION;
      } else if (AWSCommonParams.ACCESS_KEYS_OPTION_OLD.equals(credentialsType)) {
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
      String credentialsType = params.get(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD);
      if (AWSCommonParams.TEMP_CREDENTIALS_OPTION_OLD.equals(credentialsType)) {
        credentialsType = AWSCommonParams.TEMP_CREDENTIALS_OPTION;
      } else if (AWSCommonParams.ACCESS_KEYS_OPTION_OLD.equals(credentialsType)) {
        credentialsType = AWSCommonParams.ACCESS_KEYS_OPTION;
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
      if (AWSCommonParams.TEMP_CREDENTIALS_OPTION_OLD.equals(credentialsType)) {
        credentialsType = AWSCommonParams.TEMP_CREDENTIALS_OPTION;
      } else if (AWSCommonParams.ACCESS_KEYS_OPTION_OLD.equals(credentialsType)) {
        credentialsType = AWSCommonParams.ACCESS_KEYS_OPTION;
      }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
        credentialsType = AWSCommonParams.TEMP_CREDENTIALS_OPTION;
      } else if (AWSCommonParams.ACCESS_KEYS_OPTION_OLD.equals(credentialsType)) {
        credentialsType = AWSCommonParams.ACCESS_KEYS_OPTION;
      }
      params.put(AWSCommonParams.CREDENTIALS_TYPE_PARAM, credentialsType);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
        credentialsType = AWSCommonParams.ACCESS_KEYS_OPTION;
      }
      params.put(AWSCommonParams.CREDENTIALS_TYPE_PARAM, credentialsType);
      params.remove(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
      }
      params.put(AWSCommonParams.CREDENTIALS_TYPE_PARAM, credentialsType);
      params.remove(AWSCommonParams.CREDENTIALS_TYPE_PARAM_OLD);
    }

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    }

    if (params.containsKey(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.ACCESS_KEY_ID_PARAM, params.get(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD));
        params.remove(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.ACCESS_KEY_ID_PARAM, params.get(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD));
        params.remove(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.ACCESS_KEY_ID_PARAM, params.get(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD));
        params.remove(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    if (params.containsKey(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.ACCESS_KEY_ID_PARAM, params.get(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD));
        params.remove(AWSCommonParams.ACCESS_KEY_ID_PARAM_OLD);
    }

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    }

    if (params.containsKey(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD);
    } else if (params.containsKey(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD)) {
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD);
    } else if (params.containsKey(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD)) {
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    if (params.containsKey(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD);
    } else if (params.containsKey(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD));
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD);
    } else if (params.containsKey(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
        params.remove(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD);
    } else if (params.containsKey(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
        params.remove(AWSCommonParams.SECRET_ACCESS_KEY_PARAM_OLD);
    } else if (params.containsKey(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    } else if (params.containsKey(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD)) {
        params.put(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM, params.get(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD));
        params.remove(AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM_OLD);
    }

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    }

    if (params.containsKey(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD)) {
        params.put(AWSCommonParams.IAM_ROLE_ARN_PARAM, params.get(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD));
        params.remove(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD)) {
        params.put(AWSCommonParams.IAM_ROLE_ARN_PARAM, params.get(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD));
        params.remove(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD)) {
        params.put(AWSCommonParams.IAM_ROLE_ARN_PARAM, params.get(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD));
        params.remove(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    if (params.containsKey(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD)) {
        params.put(AWSCommonParams.IAM_ROLE_ARN_PARAM, params.get(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD));
        params.remove(AWSCommonParams.IAM_ROLE_ARN_PARAM_OLD);
    }

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    }

    if (params.containsKey(AWSCommonParams.EXTERNAL_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.EXTERNAL_ID_PARAM, params.get(AWSCommonParams.EXTERNAL_ID_PARAM_OLD));
        params.remove(AWSCommonParams.EXTERNAL_ID_PARAM_OLD);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.EXTERNAL_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.EXTERNAL_ID_PARAM, params.get(AWSCommonParams.EXTERNAL_ID_PARAM_OLD));
        params.remove(AWSCommonParams.EXTERNAL_ID_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.EXTERNAL_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.EXTERNAL_ID_PARAM, params.get(AWSCommonParams.EXTERNAL_ID_PARAM_OLD));
        params.remove(AWSCommonParams.EXTERNAL_ID_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    if (params.containsKey(AWSCommonParams.EXTERNAL_ID_PARAM_OLD)) {
        params.put(AWSCommonParams.EXTERNAL_ID_PARAM, params.get(AWSCommonParams.EXTERNAL_ID_PARAM_OLD));
        params.remove(AWSCommonParams.EXTERNAL_ID_PARAM_OLD);
    }

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    }

    if (params.containsKey(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD)) {
        params.put(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM, params.get(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD));
        params.remove(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD);
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD)) {
        params.put(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM, params.get(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD));
        params.remove(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

    if (params.containsKey(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD)) {
        params.put(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM, params.get(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD));
        params.remove(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD);
    }
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
    if (params.containsKey(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD)) {
        params.put(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM, params.get(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD));
        params.remove(AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD);
    }
%>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
%>

<c:set var="environment_name_param" value="<%=AWSCommonParams.ENVIRONMENT_NAME_PARAM%>"/>
<c:set var="environment_name_label" value="<%=AWSCommonParams.ENVIRONMENT_NAME_LABEL%>"/>
<c:set var="environment_type_custom" value="<%=AWSCommonParams.ENVIRONMENT_TYPE_CUSTOM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="environment_name_param" value="<%=AWSCommonParams.ENVIRONMENT_NAME_PARAM%>"/>
<c:set var="environment_name_label" value="<%=AWSCommonParams.ENVIRONMENT_NAME_LABEL%>"/>
<c:set var="environment_type_custom" value="<%=AWSCommonParams.ENVIRONMENT_TYPE_CUSTOM%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="environment_name_param" value="<%=AWSCommonParams.ENVIRONMENT_NAME_PARAM%>"/>
<c:set var="environment_name_label" value="<%=AWSCommonParams.ENVIRONMENT_NAME_LABEL%>"/>
<c:set var="environment_type_custom" value="<%=AWSCommonParams.ENVIRONMENT_TYPE_CUSTOM%>"/>

<c:set var="service_endpoint_param" value="<%=AWSCommonParams.SERVICE_ENDPOINT_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="environment_type_custom" value="<%=AWSCommonParams.ENVIRONMENT_TYPE_CUSTOM%>"/>

<c:set var="service_endpoint_param" value="<%=AWSCommonParams.SERVICE_ENDPOINT_PARAM%>"/>
<c:set var="service_endpoint_label" value="<%=AWSCommonParams.SERVICE_ENDPOINT_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="service_endpoint_param" value="<%=AWSCommonParams.SERVICE_ENDPOINT_PARAM%>"/>
<c:set var="service_endpoint_label" value="<%=AWSCommonParams.SERVICE_ENDPOINT_LABEL%>"/>

<c:set var="allRegions" value="<%=AWSRegions.getAllRegions()%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSRegions' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="service_endpoint_label" value="<%=AWSCommonParams.SERVICE_ENDPOINT_LABEL%>"/>

<c:set var="allRegions" value="<%=AWSRegions.getAllRegions()%>"/>

<c:set var="region_name_param" value="<%=AWSCommonParams.REGION_NAME_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="allRegions" value="<%=AWSRegions.getAllRegions()%>"/>

<c:set var="region_name_param" value="<%=AWSCommonParams.REGION_NAME_PARAM%>"/>
<c:set var="region_name_label" value="<%=AWSCommonParams.REGION_NAME_LABEL%>"/>
<c:set var="region_name_default" value="<%=AWSRegions.DEFAULT_REGION%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="region_name_param" value="<%=AWSCommonParams.REGION_NAME_PARAM%>"/>
<c:set var="region_name_label" value="<%=AWSCommonParams.REGION_NAME_LABEL%>"/>
<c:set var="region_name_default" value="<%=AWSRegions.DEFAULT_REGION%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSRegions' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="region_name_param" value="<%=AWSCommonParams.REGION_NAME_PARAM%>"/>
<c:set var="region_name_label" value="<%=AWSCommonParams.REGION_NAME_LABEL%>"/>
<c:set var="region_name_default" value="<%=AWSRegions.DEFAULT_REGION%>"/>

<c:set var="credentials_type_param" value="<%=AWSCommonParams.CREDENTIALS_TYPE_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="region_name_default" value="<%=AWSRegions.DEFAULT_REGION%>"/>

<c:set var="credentials_type_param" value="<%=AWSCommonParams.CREDENTIALS_TYPE_PARAM%>"/>
<c:set var="credentials_type_label" value="<%=AWSCommonParams.CREDENTIALS_TYPE_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="credentials_type_param" value="<%=AWSCommonParams.CREDENTIALS_TYPE_PARAM%>"/>
<c:set var="credentials_type_label" value="<%=AWSCommonParams.CREDENTIALS_TYPE_LABEL%>"/>

<c:set var="temp_credentials_option" value="<%=AWSCommonParams.TEMP_CREDENTIALS_OPTION%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="credentials_type_label" value="<%=AWSCommonParams.CREDENTIALS_TYPE_LABEL%>"/>

<c:set var="temp_credentials_option" value="<%=AWSCommonParams.TEMP_CREDENTIALS_OPTION%>"/>
<c:set var="temp_credentials_label" value="<%=AWSCommonParams.TEMP_CREDENTIALS_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="temp_credentials_option" value="<%=AWSCommonParams.TEMP_CREDENTIALS_OPTION%>"/>
<c:set var="temp_credentials_label" value="<%=AWSCommonParams.TEMP_CREDENTIALS_LABEL%>"/>

<c:set var="access_keys_option" value="<%=AWSCommonParams.ACCESS_KEYS_OPTION%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="temp_credentials_label" value="<%=AWSCommonParams.TEMP_CREDENTIALS_LABEL%>"/>

<c:set var="access_keys_option" value="<%=AWSCommonParams.ACCESS_KEYS_OPTION%>"/>
<c:set var="access_keys_label" value="<%=AWSCommonParams.ACCESS_KEYS_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="access_keys_option" value="<%=AWSCommonParams.ACCESS_KEYS_OPTION%>"/>
<c:set var="access_keys_label" value="<%=AWSCommonParams.ACCESS_KEYS_LABEL%>"/>

<c:set var="access_key_id_param" value="<%=AWSCommonParams.ACCESS_KEY_ID_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="access_keys_label" value="<%=AWSCommonParams.ACCESS_KEYS_LABEL%>"/>

<c:set var="access_key_id_param" value="<%=AWSCommonParams.ACCESS_KEY_ID_PARAM%>"/>
<c:set var="access_key_id_label" value="<%=AWSCommonParams.ACCESS_KEY_ID_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="access_key_id_param" value="<%=AWSCommonParams.ACCESS_KEY_ID_PARAM%>"/>
<c:set var="access_key_id_label" value="<%=AWSCommonParams.ACCESS_KEY_ID_LABEL%>"/>

<c:set var="secure_secret_access_key_param" value="<%=AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="access_key_id_label" value="<%=AWSCommonParams.ACCESS_KEY_ID_LABEL%>"/>

<c:set var="secure_secret_access_key_param" value="<%=AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM%>"/>
<c:set var="secret_access_key_param" value="<%=AWSCommonParams.SECRET_ACCESS_KEY_PARAM%>"/>
<c:set var="secret_access_key_label" value="<%=AWSCommonParams.SECRET_ACCESS_KEY_LABEL%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="secure_secret_access_key_param" value="<%=AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM%>"/>
<c:set var="secret_access_key_param" value="<%=AWSCommonParams.SECRET_ACCESS_KEY_PARAM%>"/>
<c:set var="secret_access_key_label" value="<%=AWSCommonParams.SECRET_ACCESS_KEY_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="secure_secret_access_key_param" value="<%=AWSCommonParams.SECURE_SECRET_ACCESS_KEY_PARAM%>"/>
<c:set var="secret_access_key_param" value="<%=AWSCommonParams.SECRET_ACCESS_KEY_PARAM%>"/>
<c:set var="secret_access_key_label" value="<%=AWSCommonParams.SECRET_ACCESS_KEY_LABEL%>"/>

<c:set var="iam_role_arn_param" value="<%=AWSCommonParams.IAM_ROLE_ARN_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="secret_access_key_label" value="<%=AWSCommonParams.SECRET_ACCESS_KEY_LABEL%>"/>

<c:set var="iam_role_arn_param" value="<%=AWSCommonParams.IAM_ROLE_ARN_PARAM%>"/>
<c:set var="iam_role_arn_label" value="<%=AWSCommonParams.IAM_ROLE_ARN_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="iam_role_arn_param" value="<%=AWSCommonParams.IAM_ROLE_ARN_PARAM%>"/>
<c:set var="iam_role_arn_label" value="<%=AWSCommonParams.IAM_ROLE_ARN_LABEL%>"/>

<c:set var="external_id_param" value="<%=AWSCommonParams.EXTERNAL_ID_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="iam_role_arn_label" value="<%=AWSCommonParams.IAM_ROLE_ARN_LABEL%>"/>

<c:set var="external_id_param" value="<%=AWSCommonParams.EXTERNAL_ID_PARAM%>"/>
<c:set var="external_id_label" value="<%=AWSCommonParams.EXTERNAL_ID_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="external_id_param" value="<%=AWSCommonParams.EXTERNAL_ID_PARAM%>"/>
<c:set var="external_id_label" value="<%=AWSCommonParams.EXTERNAL_ID_LABEL%>"/>

<c:set var="use_default_cred_chain_param" value="<%=AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM%>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="external_id_label" value="<%=AWSCommonParams.EXTERNAL_ID_LABEL%>"/>

<c:set var="use_default_cred_chain_param" value="<%=AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM%>"/>
<c:set var="use_default_cred_chain_label" value="<%=AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_LABEL%>"/>

```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="use_default_cred_chain_param" value="<%=AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM%>"/>
<c:set var="use_default_cred_chain_label" value="<%=AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_LABEL%>"/>

<c:set var="default_cred_chain_disabled" value="<%= AWSCommonParams.DEFAULT_CREDENTIALS_PROVIDER_CHAIN_DISABLED_PARAM %>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java
<c:set var="use_default_cred_chain_label" value="<%=AWSCommonParams.USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_LABEL%>"/>

<c:set var="default_cred_chain_disabled" value="<%= AWSCommonParams.DEFAULT_CREDENTIALS_PROVIDER_CHAIN_DISABLED_PARAM %>"/>
<c:set var="default_cred_chain_hidden" value="<%= AWSCommonParams.DEFAULT_CREDENTIALS_PROVIDER_CHAIN_HIDDEN_PARAM %>"/>
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-common/src/main/resources/buildServerResources/constantsAWSCommonParams.jspf`
#### Snippet
```java

<c:set var="default_cred_chain_disabled" value="<%= AWSCommonParams.DEFAULT_CREDENTIALS_PROVIDER_CHAIN_DISABLED_PARAM %>"/>
<c:set var="default_cred_chain_hidden" value="<%= AWSCommonParams.DEFAULT_CREDENTIALS_PROVIDER_CHAIN_HIDDEN_PARAM %>"/>
```

### Deprecation
'jetbrains.buildServer.clouds.amazon.connector.impl.dataBeans.AwsConnectionBean' is deprecated
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/clients/EC2ClientCreator.java`
#### Snippet
```java

  @NotNull
  public AmazonEC2 createClient(@NotNull AwsConnectionBean connection) throws ConnectionCredentialsException {
    final AwsCredentialsData credentialsData = connection.getAwsCredentialsHolder().getAwsCredentials();
    final AmazonEC2ClientBuilder builder = AmazonEC2ClientBuilder.standard()
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSCommonParams' is deprecated
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/clients/EC2ClientCreator.java`
#### Snippet
```java
    final AwsCredentialsData credentialsData = connection.getAwsCredentialsHolder().getAwsCredentials();
    final AmazonEC2ClientBuilder builder = AmazonEC2ClientBuilder.standard()
                                                                 .withClientConfiguration(AWSCommonParams.createClientConfigurationEx("ec2Client_" + connection.getConnectionId()));

    final String accessKeyId = credentialsData.getAccessKeyId();
```

### Deprecation
'jetbrains.buildServer.util.amazon.AWSClients' is deprecated
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
import static jetbrains.buildServer.serverSide.TeamCityProperties.getInteger;
import static jetbrains.buildServer.serverSide.TeamCityProperties.getPropertyOrNull;
import static jetbrains.buildServer.util.amazon.AWSClients.*;

/**
```

## RuleId[id=RedundantStringFormatCall]
### RedundantStringFormatCall
Redundant call to `format()`
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/featureDevelopment/credsToAgent/InjectAwsCredentialsToTheBuildContext.java`
#### Snippet
```java
        String awsConnectionId = connectionBuildFeatureProps.get(CHOSEN_AWS_CONN_ID_PARAM);
        if (awsConnectionId == null) {
          String message = String.format("Chosen AWS Connection ID is null in the BuildFeature, will not add AWS Connection to the Build");
          context.getBuild().getBuildLog()
                 .messageAsync(
```

## RuleId[id=PointlessNullCheck]
### PointlessNullCheck
Unnecessary 'null' check before 'isAmazonServiceException()' call
in `aws-core-common/src/main/java/jetbrains/buildServer/clouds/amazon/connector/utils/AwsExceptionUtils.java`
#### Snippet
```java
          ((AmazonServiceException)exception).getErrorMessage()
        );
      } else if (cause != null && isAmazonServiceException(cause)) {
        return String.format(
          "Error type: <%s>, message: %s",
```

## RuleId[id=ManualMinMaxCalculation]
### ManualMinMaxCalculation
Can be replaced with 'Math.min()' call
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
  static int patchSessionDuration(int sessionDuration) {
    if (sessionDuration < 900) return 900;
    if (sessionDuration > 3600) return 3600;
    return sessionDuration;
  }
```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java

      if (ParamUtil.isDefaultCredsProviderType(properties) && ParamUtil.isDefaultCredsProvidertypeDisabled()) {
        return Arrays.asList(new InvalidProperty(CREDENTIALS_TYPE_PARAM, DISABLED_AWS_CONNECTION_TYPE_ERROR_MSG));
      }

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java

  public static int calculateIdentity(@NotNull String baseDir, @NotNull Map<String, String> params, String... otherParts) {
    List<String> allParts = new ArrayList<String>(CollectionsUtil.join(getIdentityFormingParams(params), Arrays.asList(otherParts)));
    allParts = CollectionsUtil.filterNulls(allParts);
    Collections.sort(allParts);
```

## RuleId[id=RedundantTypeArguments]
### RedundantTypeArguments
Explicit type arguments can be inferred
in `aws-core-common/src/main/java/jetbrains/buildServer/util/PathMappings.java`
#### Snippet
```java

  private boolean matches(@NotNull String rule, @NotNull File file) {
    return doCollectFiles(Collections.<String>singleton(rule)).contains(file);
  }

```

## RuleId[id=MismatchedStringBuilderQueryUpdate]
### MismatchedStringBuilderQueryUpdate
Contents of `StringBuilder errorMessageBuilder` are updated, but never queried
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/connector/impl/AwsConnectorFactoryImpl.java`
#### Snippet
```java

    try {
      StringBuilder errorMessageBuilder = new StringBuilder();
      errorMessageBuilder.append("This ID is invalid, please, dont use these symbols: ");
      errorMessageBuilder.append(IdGeneratorRegistry.PROHIBITED_CHARS);
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `message` initializer `String.format(EC2_CLIENT_ERROR, e.getMessage())` is redundant
in `aws-core-server/src/main/java/jetbrains/buildServer/clouds/amazon/ami/cleanup/EC2AmiCleanupExtension.java`
#### Snippet
```java
          return myClientCreator.createClient(awsConnection);
        } catch (ConnectionCredentialsException e) {
          final String message = String.format(EC2_CLIENT_ERROR, e.getMessage());
          CLEANUP.warn(message);
          cleanupContext.onBuildCleanupError(this, build, message);
```

## RuleId[id=NullableProblems]
### NullableProblems
Not annotated parameter overrides @NotNull parameter
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/S3Util.java`
#### Snippet
```java
      private final AtomicInteger threadCount = new AtomicInteger(1);

      public Thread newThread(@NotNull Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("amazon-util-s3-transfer-manager-worker-" + threadCount.getAndIncrement());
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `exception instanceof ConnectionCredentialsException` is always `true`
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AwsTestConnectionController.java`
#### Snippet
```java
      errors.addError(new InvalidProperty(CREDENTIALS_TYPE_PARAM, actionDescription + AwsExceptionUtils.getAwsErrorMessage(exception)));
      Loggers.CLOUD.debug(actionDescription, exception);
    } else if(exception instanceof ConnectionCredentialsException) {
      errors.addError(new InvalidProperty(CREDENTIALS_TYPE_PARAM, actionDescription + exception.getMessage()));
      Loggers.CLOUD.debug(actionDescription, exception);
```

### ConstantValue
Condition `Boolean.parseBoolean(USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD)` is always `false` when reached
in `aws-core-common/src/main/java/jetbrains/buildServer/util/amazon/AWSCommonParams.java`
#### Snippet
```java
      return false;
    }
    return Boolean.parseBoolean(params.get(USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM)) || Boolean.parseBoolean(USE_DEFAULT_CREDENTIAL_PROVIDER_CHAIN_PARAM_OLD);
  }

```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `aws-core-server/src/main/java/jetbrains/buildServer/serverSide/oauth/aws/controllers/AvailableAwsConnsController.java`
#### Snippet
```java
public class AvailableAwsConnsController extends BaseAwsConnectionController {
  public static final String PATH = AVAIL_AWS_CONNECTIONS_CONTROLLER_URL;
  private final String availableAwsConnsBeanName = "awsConnections";

  private final OAuthConnectionsManager myConnectionsManager;
```

## RuleId[id=IgnoreResultOfCall]
### IgnoreResultOfCall
Result of `File.mkdirs()` is ignored
in `aws-core-agent/src/main/java/jetbrains/buildServer/clouds/amazon/connector/AwsCredentialsHandler.java`
#### Snippet
```java

      //We need directory to create temp file name
      tempDirectory.mkdirs();

      File file = new File(tempDirectory, AWS_CREDENTIALS_FILE_NAME);
```

