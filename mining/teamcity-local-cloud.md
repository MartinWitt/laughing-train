# teamcity-local-cloud 
 
# Bad smells
I found 14 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringXmlModelInspection | 5 | false |
| SpringBeanConstructorArgInspection | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| UNUSED_IMPORT | 2 | false |
| WrapperTypeMayBePrimitive | 1 | false |
| ProtectedMemberInFinalClass | 1 | true |
| MismatchedCollectionQueryUpdate | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'LocalCloudClientFactory'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **LocalCloudClientFactory(...):** |   | **Bean:** |
| CloudRegistrar cloudRegistrar     |   | **???**   |
| PluginDescriptor pluginDescriptor |   | **???**   |
in `src/META-INF/build-server-plugin-local-cloud.xml`
#### Snippet
```java
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.clouds.local.LocalCloudClientFactory"/>
  <bean class="jetbrains.buildServer.clouds.local.LocalCloudImageDetailsExtension"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'LocalCloudImageDetailsExtension'#treeend

*** ** * ** ***

|-------------------------------------------|---|-----------|
| **LocalCloudImageDetailsExtension(...):** |   | **Bean:** |
| PagePlaces pagePlaces                     |   | **???**   |
| PluginDescriptor pluginDescriptor         |   | **???**   |
in `src/META-INF/build-server-plugin-local-cloud.xml`
#### Snippet
```java

  <bean class="jetbrains.buildServer.clouds.local.LocalCloudClientFactory"/>
  <bean class="jetbrains.buildServer.clouds.local.LocalCloudImageDetailsExtension"/>

</beans>
```

## RuleId[id=WrapperTypeMayBePrimitive]
### WrapperTypeMayBePrimitive
Type may be primitive
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
          String poolIdStr = line.substring("agentPoolId:".length());
          try {
            Integer poolId = Integer.parseInt(poolIdStr);
            image.setAgentPoolId(poolId);
          } catch (NumberFormatException e) {
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd"
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `src/META-INF/build-server-plugin-local-cloud.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.clouds.local.LocalCloudClientFactory"/>
```

## RuleId[id=ProtectedMemberInFinalClass]
### ProtectedMemberInFinalClass
Class member declared `protected` in 'final' class
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
    new WaitFor(STATUS_WAITING_TIMEOUT) {
      @Override
      protected boolean condition() {
        return myStatus == status;
      }
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.clouds.*;`
in `src/jetbrains/buildServer/clouds/local/LocalCloudClient.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.local;

import jetbrains.buildServer.clouds.*;
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.serverSide.AgentDescription;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.clouds.*;`
in `src/jetbrains/buildServer/clouds/local/LocalCloudImage.java`
#### Snippet
```java
package jetbrains.buildServer.clouds.local;

import jetbrains.buildServer.clouds.*;
import jetbrains.buildServer.serverSide.agentPools.AgentPool;
import org.jetbrains.annotations.NotNull;
```

## RuleId[id=MismatchedCollectionQueryUpdate]
### MismatchedCollectionQueryUpdate
Contents of collection `env` are updated, but never queried
in `src/jetbrains/buildServer/clouds/local/LocalCloudInstance.java`
#### Snippet
```java
    final File workDir = new File(myBaseDir, "bin");
    cmd.setWorkDirectory(workDir.getAbsolutePath());
    final Map<String, String> env = new HashMap<String, String>(System.getenv());
    //fix Java
    env.put("JAVA_HOME", System.getProperty("java.home"));
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
  <bean class="jetbrains.buildServer.serverSide.ServerPaths"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'openapi'
in `fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
  <bean class="jetbrains.buildServer.serverSide.ServerPaths"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class 'PluginDescriptor'
in `fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
  <bean class="jetbrains.buildServer.serverSide.ServerPaths"/>
</beans>
```

### SpringXmlModelInspection
Cannot resolve class or package 'serverSide'
in `fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
  <bean class="jetbrains.buildServer.serverSide.ServerPaths"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'ServerPaths'
in `fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
  <bean class="jetbrains.buildServer.serverSide.ServerPaths"/>
</beans>

```

