# teamcity-queue-pauser 
 
# Bad smells
I found 11 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 6 | false |
| SpringXmlModelInspection | 3 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'QueueStateChangePageController'#treeend

*** ** * ** ***

|------------------------------------------|---|------------------------------------|
| **QueueStateChangePageController(...):** |   | **Bean:**                          |
| PagePlaces pagePlaces                    |   | **???**                            |
| PluginDescriptor descriptor              |   | **???**                            |
| SecurityContext securityContext          |   | **???**                            |
| QueueStateManager queueStateManager      |   | Autowired: null(QueueStateManager) |
| ServerResponsibility responsibility      |   | **???**                            |
| WebControllerManager controllerManager   |   | **???**                            |
in `server/src/META-INF/build-server-plugin-queue-pauser.xml`
#### Snippet
```java
       default-autowire="constructor">
  <bean class="jetbrains.buildServer.queueManager.server.QueuePausePrecondition"/>
  <bean class="jetbrains.buildServer.queueManager.pages.QueueStateChangePageController"/>
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateController"/>
  <bean class="jetbrains.buildServer.queueManager.server.ChangeQueueStateAction"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'QueueStateController'#treeend

*** ** * ** ***

|--------------------------------|---|-----------|
| **QueueStateController(...):** |   | **Bean:** |
| WebControllerManager manager   |   | **???**   |
in `server/src/META-INF/build-server-plugin-queue-pauser.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.queueManager.server.QueuePausePrecondition"/>
  <bean class="jetbrains.buildServer.queueManager.pages.QueueStateChangePageController"/>
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateController"/>
  <bean class="jetbrains.buildServer.queueManager.server.ChangeQueueStateAction"/>
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateHealthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ChangeQueueStateAction'#treeend

*** ** * ** ***

|-------------------------------------------|---|---------------------------------------|
| **ChangeQueueStateAction(...):**          |   | **Bean:**                             |
| QueueStateManager queueStateManager       |   | Autowired: null(QueueStateManager)    |
| QueueStateController queueStateController |   | Autowired: null(QueueStateController) |
| SecurityContext securityContext           |   | **???**                               |
| AuditLogFactory logFactory                |   | **???**                               |
| ServerResponsibility responsibility       |   | **???**                               |
in `server/src/META-INF/build-server-plugin-queue-pauser.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.queueManager.pages.QueueStateChangePageController"/>
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateController"/>
  <bean class="jetbrains.buildServer.queueManager.server.ChangeQueueStateAction"/>
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateHealthReport"/>
  <bean class="jetbrains.buildServer.queueManager.server.FreeSpaceQueuePauser"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'QueueStateHealthReport'#treeend

*** ** * ** ***

|-------------------------------------------|---|---------------------------------------|
| **QueueStateHealthReport(...):**          |   | **Bean:**                             |
| PluginDescriptor pluginDescriptor         |   | **???**                               |
| QueueStateManager queueStateManager       |   | Autowired: null(QueueStateManager)    |
| PagePlaces pagePlaces                     |   | **???**                               |
| FreeSpaceQueuePauser freeSpaceQueuePauser |   | Autowired: null(FreeSpaceQueuePauser) |
| ServerResponsibility responsibility       |   | **???**                               |
in `server/src/META-INF/build-server-plugin-queue-pauser.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateController"/>
  <bean class="jetbrains.buildServer.queueManager.server.ChangeQueueStateAction"/>
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateHealthReport"/>
  <bean class="jetbrains.buildServer.queueManager.server.FreeSpaceQueuePauser"/>
  <bean class="jetbrains.buildServer.queueManager.settings.QueueStateManager"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FreeSpaceQueuePauser'#treeend

*** ** * ** ***

|---------------------------------------------------|---|------------------------------------|
| **FreeSpaceQueuePauser(...):**                    |   | **Bean:**                          |
| EventDispatcher\<BuildServerListener\> dispatcher |   | **???**                            |
| QueueStateManager queueStateManager               |   | Autowired: null(QueueStateManager) |
| DiskSpaceWatcher diskSpaceWatcher                 |   | **???**                            |
| ServerResponsibility responsibility               |   | **???**                            |
| GlobalHealthItemsTracker globalHealthItemsTracker |   | **???**                            |
in `server/src/META-INF/build-server-plugin-queue-pauser.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.queueManager.server.ChangeQueueStateAction"/>
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateHealthReport"/>
  <bean class="jetbrains.buildServer.queueManager.server.FreeSpaceQueuePauser"/>
  <bean class="jetbrains.buildServer.queueManager.settings.QueueStateManager"/>
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'QueueStateManager'#treeend

*** ** * ** ***

|---------------------------------------------------|---|-----------|
| **QueueStateManager(...):**                       |   | **Bean:** |
| UserModel userModel                               |   | **???**   |
| SettingsPersister settingsPersister               |   | **???**   |
| FileWatcherFactory fileWatcherFactory             |   | **???**   |
| ServerPaths serverPaths                           |   | **???**   |
| GlobalHealthItemsTracker globalHealthItemsTracker |   | **???**   |
in `server/src/META-INF/build-server-plugin-queue-pauser.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.queueManager.server.QueueStateHealthReport"/>
  <bean class="jetbrains.buildServer.queueManager.server.FreeSpaceQueuePauser"/>
  <bean class="jetbrains.buildServer.queueManager.settings.QueueStateManager"/>
</beans>

```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `server/src/META-INF/build-server-plugin-queue-pauser.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean class="jetbrains.buildServer.queueManager.server.QueuePausePrecondition"/>
  <bean class="jetbrains.buildServer.queueManager.pages.QueueStateChangePageController"/>
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'openapi'
in `server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'PluginDescriptor'
in `server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

