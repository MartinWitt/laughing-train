# teamcity-aws-sns-trigger-plugin 
 
# Bad smells
I found 8 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 4 | false |
| UNCHECKED_WARNING | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
| DataFlowIssue | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsSnsHttpEndpointController'#treeend

*** ** * ** ***

|-------------------------------------------|---|-----------|
| **AwsSnsHttpEndpointController(...):**    |   | **Bean:** |
| SBuildServer server                       |   | **???**   |
| WebControllerManager webControllerManager |   | **???**   |
| ProjectManager projectManager             |   | **???**   |
| HttpApi serverApi                         |   | **???**   |
| AuthorizationInterceptor authInterceptor  |   | **???**   |
in `amazon-sns-trigger-server/src/main/resources/META-INF/build-server-plugin-aws-sns-trigger-plugin.xml`
#### Snippet
```java

    <!--    build trigger -->
    <bean class="jetbrains.buildServer.clouds.amazon.sns.trigger.controllers.AwsSnsHttpEndpointController"/>
    <bean class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.AwsSnsTriggeringContext"/>
    <bean id="awsSnsTrigger" class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.SnsBuildTriggerService"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AwsSnsTriggeringContext'#treeend

*** ** * ** ***

|------------------------------------------------------------------------|---|-------------------------------------------------------------------------------|
| **AwsSnsTriggeringContext(...):**                                      |   | **Bean:**                                                                     |
| ProjectManager projectManager                                          |   | **???**                                                                       |
| WebLinks webLinks                                                      |   | **???**                                                                       |
| SnsMessageParametersCustomisationService parameterCustomizationService |   | Autowired: awsSnsParametersProvider(SnsMessageParametersCustomisationService) |
in `amazon-sns-trigger-server/src/main/resources/META-INF/build-server-plugin-aws-sns-trigger-plugin.xml`
#### Snippet
```java
    <!--    build trigger -->
    <bean class="jetbrains.buildServer.clouds.amazon.sns.trigger.controllers.AwsSnsHttpEndpointController"/>
    <bean class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.AwsSnsTriggeringContext"/>
    <bean id="awsSnsTrigger" class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.SnsBuildTriggerService"/>
    <bean id="awsSnsParametersProvider"
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SnsBuildTriggerService'#treeend

*** ** * ** ***

|-------------------------------------------|---|------------------------------------------|
| **SnsBuildTriggerService(...):**          |   | **Bean:**                                |
| ExtensionHolder extensionHolder           |   | **???**                                  |
| PluginDescriptor descriptor               |   | **???**                                  |
| AwsSnsTriggeringContext triggeringContext |   | Autowired: null(AwsSnsTriggeringContext) |
in `amazon-sns-trigger-server/src/main/resources/META-INF/build-server-plugin-aws-sns-trigger-plugin.xml`
#### Snippet
```java
    <bean class="jetbrains.buildServer.clouds.amazon.sns.trigger.controllers.AwsSnsHttpEndpointController"/>
    <bean class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.AwsSnsTriggeringContext"/>
    <bean id="awsSnsTrigger" class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.SnsBuildTriggerService"/>
    <bean id="awsSnsParametersProvider"
          class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.SnsMessageParametersCustomisationService"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SnsMessageParametersCustomisationService'#treeend

*** ** * ** ***

|----------------------------------------------------|---|-----------|
| **SnsMessageParametersCustomisationService(...):** |   | **Bean:** |
| ExtensionHolder extensionHolder                    |   | **???**   |
in `amazon-sns-trigger-server/src/main/resources/META-INF/build-server-plugin-aws-sns-trigger-plugin.xml`
#### Snippet
```java
    <bean id="awsSnsTrigger" class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.SnsBuildTriggerService"/>
    <bean id="awsSnsParametersProvider"
          class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.SnsMessageParametersCustomisationService"/>
    <bean id="awsSnsParametersDescriptionProvider"
          class="jetbrains.buildServer.clouds.amazon.sns.trigger.service.SnsMessageParameterDescriptionProvider"/>
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `amazon-sns-trigger-server/src/main/resources/META-INF/build-server-plugin-aws-sns-trigger-plugin.xml`
#### Snippet
```java
       xmlns="http://www.springframework.org/schema/beans"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

    <!--    build trigger -->
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/utils/AwsSnsMessageDetailsHelper.java`
#### Snippet
```java
    Instant timestamp = Instant.parse((String) payload.get(AwsSnsTriggerConstants.NOTIFICATION_TIMESTAMP_KEY));
    String unsubscribeUrl = (String) payload.get(AwsSnsTriggerConstants.UNSUBSCRIBE_URL_KEY);
    Map<String, Object> attributes = (Map<String, Object>) payload.get(AwsSnsTriggerConstants.NOTIFICATION_ATTRIBUTES_KEY);

    return new SnsNotificationDto(
```

### UNCHECKED_WARNING
Unchecked cast: 'java.lang.Object' to 'java.util.Map'
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/service/SnsBuildTriggeringPolicy.java`
#### Snippet
```java
    if (latestSnsMessage.getAttributes() != null) {
      latestSnsMessage.getAttributes().forEach((key, value) -> {
        String stringValue = (String) ((Map<String, Object>) value).get("Value");
        result.put(AwsSnsTriggerConstants.SNS_MESSAGE_ATTRIBUTES_PARAMETER_PLACEHOLDER + key, stringValue);
      });
```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Argument `is` might be null
in `amazon-sns-trigger-server/src/main/java/jetbrains/buildServer/clouds/amazon/sns/trigger/service/SnsMessageParameterDescriptionProvider.java`
#### Snippet
```java
        InputStream is = getClass().getResourceAsStream(PARAM_DESCRIPTIONS_RES);
        try {
            Element parsed = FileUtil.parseDocument(is, false);
            List children = parsed.getChildren("description");

```

