# teamcity-shared-resources 
 
# Bad smells
I found 30 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 16 | false |
| UNCHECKED_WARNING | 3 | false |
| SuspiciousMethodCalls | 3 | false |
| SpringXmlModelInspection | 3 | false |
| JavadocDeclaration | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 1 | false |
| JavadocReference | 1 | false |
| CStyleArrayDeclaration | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'SharedResourcesBuildFeature'#treeend

*** ** * ** ***

|---------------------------------------|---|------------------------------------|
| **SharedResourcesBuildFeature(...):** |   | **Bean:**                          |
| PluginDescriptor descriptor           |   | **???**                            |
| FeatureParams featureParams           |   | Autowired: null(FeatureParamsImpl) |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java

  <!-- ===  BUILD FEATURE ===-->
  <bean class="jetbrains.buildServer.sharedResources.server.SharedResourcesBuildFeature"/>
  <bean class="jetbrains.buildServer.sharedResources.server.BuildFeatureParametersProvider"/>
  <bean class="jetbrains.buildServer.sharedResources.server.SharedResourcesAgentsFilter"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SharedResourcesAgentsFilter'#treeend

*** ** * ** ***

|---------------------------------------------|---|----------------------------------------------|
| **SharedResourcesAgentsFilter(...):**       |   | **Bean:**                                    |
| SharedResourcesFeatures features            |   | Autowired: null(SharedResourcesFeaturesImpl) |
| Locks locks                                 |   | Autowired: null(LocksImpl)                   |
| TakenLocks takenLocks                       |   | Autowired: null(TakenLocksImpl)              |
| RunningBuildsManagerEx runningBuildsManager |   | **???**                                      |
| ConfigurationInspector inspector            |   | Autowired: null(ConfigurationInspector)      |
| LocksStorage locksStorage                   |   | Autowired: null(LocksStorageImpl)            |
| Resources resources                         |   | Autowired: null(ResourcesImpl)               |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.server.SharedResourcesBuildFeature"/>
  <bean class="jetbrains.buildServer.sharedResources.server.BuildFeatureParametersProvider"/>
  <bean class="jetbrains.buildServer.sharedResources.server.SharedResourcesAgentsFilter"/>
  <bean class="jetbrains.buildServer.sharedResources.server.SharedResourcesContextProcessor"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'InvalidLocksReport'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------------------------------------|
| **InvalidLocksReport(...):**      |   | **Bean:**                               |
| PluginDescriptor pluginDescriptor |   | **???**                                 |
| PagePlaces pagePlaces             |   | **???**                                 |
| ConfigurationInspector inspector  |   | Autowired: null(ConfigurationInspector) |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <!-- === HEALTH === -->
  <bean class="jetbrains.buildServer.sharedResources.server.ConfigurationInspector"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.InvalidLocksReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.DuplicateResourcesHealthReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.InvalidResourcesHealthReport"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'DuplicateResourcesHealthReport'#treeend

*** ** * ** ***

|------------------------------------------|---|-----------------------------------------|
| **DuplicateResourcesHealthReport(...):** |   | **Bean:**                               |
| PluginDescriptor pluginDescriptor        |   | **???**                                 |
| PagePlaces pagePlaces                    |   | **???**                                 |
| ConfigurationInspector inspector         |   | Autowired: null(ConfigurationInspector) |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.server.ConfigurationInspector"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.InvalidLocksReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.DuplicateResourcesHealthReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.InvalidResourcesHealthReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.analysis.ResourceUsageAnalyzer"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'InvalidResourcesHealthReport'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------------------------------------|
| **InvalidResourcesHealthReport(...):** |   | **Bean:**                               |
| PluginDescriptor pluginDescriptor      |   | **???**                                 |
| PagePlaces pagePlaces                  |   | **???**                                 |
| ConfigurationInspector inspector       |   | Autowired: null(ConfigurationInspector) |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.server.health.InvalidLocksReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.DuplicateResourcesHealthReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.health.InvalidResourcesHealthReport"/>
  <bean class="jetbrains.buildServer.sharedResources.server.analysis.ResourceUsageAnalyzer"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'BuildUsedResourcesReportPage'#treeend

*** ** * ** ***

|----------------------------------------|---|-------------------------------------------|
| **BuildUsedResourcesReportPage(...):** |   | **Bean:**                                 |
| PagePlaces pagePlaces                  |   | **???**                                   |
| SBuildServer server                    |   | **???**                                   |
| PluginDescriptor descriptor            |   | **???**                                   |
| BuildUsedResourcesReport report        |   | Autowired: null(BuildUsedResourcesReport) |
| Locks locks                            |   | Autowired: null(LocksImpl)                |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.server.report.UsedResourcesSerializer"/>
  <bean class="jetbrains.buildServer.sharedResources.server.report.BuildUsedResourcesReport"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.usage.BuildUsedResourcesReportPage"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.usage.ResourceUsages"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ResourceUsages'#treeend

*** ** * ** ***

|-----------------------------------|---|----------------------------------------|
| **ResourceUsages(...):**          |   | **Bean:**                              |
| PagePlaces pagePlaces             |   | **???**                                |
| PluginDescriptor pluginDescriptor |   | **???**                                |
| ProjectManager projectManager     |   | **???**                                |
| Resources resources               |   | Autowired: null(ResourcesImpl)         |
| ResourceUsageAnalyzer analyzer    |   | Autowired: null(ResourceUsageAnalyzer) |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.server.report.BuildUsedResourcesReport"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.usage.BuildUsedResourcesReportPage"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.usage.ResourceUsages"/>

  <!-- === Actions === -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AddResourceAction'#treeend

*** ** * ** ***

|-----------------------------------------|---|----------------------------------------------|
| **AddResourceAction(...):**             |   | **Bean:**                                    |
| ProjectManager projectManager           |   | **???**                                      |
| ResourceProjectFeatures projectFeatures |   | Autowired: null(ResourceProjectFeaturesImpl) |
| ResourceHelper resourceHelper           |   | Autowired: null(ResourceHelper)              |
| Messages messages                       |   | Autowired: null(Messages)                    |
| ConfigActionFactory configActionFactory |   | **???**                                      |
| Resources resources                     |   | Autowired: null(ResourcesImpl)               |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java

  <!-- === Actions === -->
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.AddResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.DeleteResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EditResourceAction"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'DeleteResourceAction'#treeend

*** ** * ** ***

|-----------------------------------------|---|----------------------------------------------|
| **DeleteResourceAction(...):**          |   | **Bean:**                                    |
| ProjectManager projectManager           |   | **???**                                      |
| ResourceProjectFeatures projectFeatures |   | Autowired: null(ResourceProjectFeaturesImpl) |
| ResourceHelper resourceHelper           |   | Autowired: null(ResourceHelper)              |
| Messages messages                       |   | Autowired: null(Messages)                    |
| ConfigActionFactory configActionFactory |   | **???**                                      |
| Resources resources                     |   | Autowired: null(ResourcesImpl)               |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <!-- === Actions === -->
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.AddResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.DeleteResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EditResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EnableDisableResourceAction"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'EditResourceAction'#treeend

*** ** * ** ***

|-----------------------------------------|---|----------------------------------------------|
| **EditResourceAction(...):**            |   | **Bean:**                                    |
| ProjectManager projectManager           |   | **???**                                      |
| ResourceProjectFeatures projectFeatures |   | Autowired: null(ResourceProjectFeaturesImpl) |
| SharedResourcesFeatures buildFeatures   |   | Autowired: null(SharedResourcesFeaturesImpl) |
| ResourceHelper resourceHelper           |   | Autowired: null(ResourceHelper)              |
| Messages messages                       |   | Autowired: null(Messages)                    |
| ConfigActionFactory configActionFactory |   | **???**                                      |
| Resources resources                     |   | Autowired: null(ResourcesImpl)               |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.AddResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.DeleteResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EditResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EnableDisableResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.SharedResourcesActionsController"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'EnableDisableResourceAction'#treeend

*** ** * ** ***

|-----------------------------------------|---|----------------------------------------------|
| **EnableDisableResourceAction(...):**   |   | **Bean:**                                    |
| ProjectManager projectManager           |   | **???**                                      |
| ResourceProjectFeatures projectFeatures |   | Autowired: null(ResourceProjectFeaturesImpl) |
| ResourceHelper resourceHelper           |   | Autowired: null(ResourceHelper)              |
| Messages messages                       |   | Autowired: null(Messages)                    |
| ConfigActionFactory configActionFactory |   | **???**                                      |
| Resources resources                     |   | Autowired: null(ResourcesImpl)               |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.DeleteResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EditResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EnableDisableResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.SharedResourcesActionsController"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SharedResourcesActionsController'#treeend

*** ** * ** ***

|---------------------------------------------------------|---|----------------------------------------------|
| **SharedResourcesActionsController(...):**              |   | **Bean:**                                    |
| WebControllerManager controllerManager                  |   | **???**                                      |
| AddResourceAction addResourceAction                     |   | Autowired: null(AddResourceAction)           |
| DeleteResourceAction deleteResourceAction               |   | Autowired: null(DeleteResourceAction)        |
| EditResourceAction editResourceAction                   |   | Autowired: null(EditResourceAction)          |
| EnableDisableResourceAction enableDisableResourceAction |   | Autowired: null(EnableDisableResourceAction) |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EditResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.actions.EnableDisableResourceAction"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.SharedResourcesActionsController"/>

  <!-- === PAGES === -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'EditFeatureController'#treeend

*** ** * ** ***

|---------------------------------------|---|----------------------------------------------------|
| **EditFeatureController(...):**       |   | **Bean:**                                          |
| PluginDescriptor descriptor           |   | **???**                                            |
| WebControllerManager web              |   | **???**                                            |
| EditBuildTypeFormFactory formFactory  |   | **???**                                            |
| Resources resources                   |   | Autowired: null(ResourcesImpl)                     |
| SharedResourcesFeatureFactory factory |   | Autowired: null(SharedResourcesFeatureFactoryImpl) |
| ConfigurationInspector inspector      |   | Autowired: null(ConfigurationInspector)            |
| ProjectManager projectManager         |   | **???**                                            |
| BeansFactory beansFactory             |   | Autowired: null(BeansFactory)                      |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <!-- === PAGES === -->
  <bean class="jetbrains.buildServer.sharedResources.pages.beans.BeansFactory"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.EditFeatureController"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.SharedResourcesPage"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SharedResourcesPage'#treeend

*** ** * ** ***

|----------------------------------|---|-----------------------------------------|
| **SharedResourcesPage(...):**    |   | **Bean:**                               |
| PagePlaces pagePlaces            |   | **???**                                 |
| PluginDescriptor descriptor      |   | **???**                                 |
| Resources resources              |   | Autowired: null(ResourcesImpl)          |
| SecurityContext securityContext  |   | **???**                                 |
| ConfigurationInspector inspector |   | Autowired: null(ConfigurationInspector) |
| ResourceUsageAnalyzer analyzer   |   | Autowired: null(ResourceUsageAnalyzer)  |
| BeansFactory beansFactory        |   | Autowired: null(BeansFactory)           |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.pages.beans.BeansFactory"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.EditFeatureController"/>
  <bean class="jetbrains.buildServer.sharedResources.pages.SharedResourcesPage"/>

  <!-- ===  INTERNALS  === -->
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'LocksStorageImpl'#treeend

*** ** * ** ***

|---------------------------------------------------|---|-----------|
| **LocksStorageImpl(...):**                        |   | **Bean:** |
| EventDispatcher\<BuildServerListener\> dispatcher |   | **???**   |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <!-- ===  INTERNALS  === -->
  <bean class="jetbrains.buildServer.sharedResources.server.project.ResourceProjectFeaturesImpl"/>
  <bean class="jetbrains.buildServer.sharedResources.server.runtime.LocksStorageImpl"/>
  <bean class="jetbrains.buildServer.sharedResources.server.runtime.TakenLocksImpl"/>
  <bean class="jetbrains.buildServer.sharedResources.server.feature.LocksImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ResourcesImpl'#treeend

*** ** * ** ***

|-------------------------------------------------|---|----------------------------------------------|
| **ResourcesImpl(...):**                         |   | **Bean:**                                    |
| ProjectManager projectManager                   |   | **???**                                      |
| ResourceProjectFeatures resourceProjectFeatures |   | Autowired: null(ResourceProjectFeaturesImpl) |
in `server/src/META-INF/build-server-plugin-shared-resources.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.sharedResources.server.runtime.TakenLocksImpl"/>
  <bean class="jetbrains.buildServer.sharedResources.server.feature.LocksImpl"/>
  <bean class="jetbrains.buildServer.sharedResources.server.feature.ResourcesImpl"/>
  <bean class="jetbrains.buildServer.sharedResources.server.feature.SharedResourcesFeatureFactoryImpl"/>
  <bean class="jetbrains.buildServer.sharedResources.server.feature.FeatureParamsImpl"/>
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

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.HashMap' to 'java.util.Map'
in `server/src/jetbrains/buildServer/sharedResources/server/feature/SharedResourcesFeatureImpl.java`
#### Snippet
```java
      final String locksAsString = myLocks.asFeatureParameter(myLockedResources.values());
      // update build feature parameters
      final Map<String, String> newParams = new HashMap<>(myDescriptor.getParameters());
      newParams.put(LOCKS_FEATURE_PARAM_KEY, locksAsString);
      // update build feature
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeMap' to 'java.util.Map\>'
in `server/src/jetbrains/buildServer/sharedResources/pages/usage/ResourceUsages.java`
#### Snippet
```java
    final String currentProjectId = request.getParameter("resourceProjectId");
    int totalUsagesNum = 0;
    final Map<SBuildType, List<Lock>> buildTypes = new TreeMap<>(new BuildTypeComparator(myProjectManager));
    final Map<BuildTypeTemplate, List<Lock>> templates = new TreeMap<>(new TemplateComparator(myProjectManager.getProjectsComparator()));
    final SProject project = findProject(currentProjectId);
```

### UNCHECKED_WARNING
Unchecked assignment: 'java.util.TreeMap' to 'java.util.Map\>'
in `server/src/jetbrains/buildServer/sharedResources/pages/usage/ResourceUsages.java`
#### Snippet
```java
    int totalUsagesNum = 0;
    final Map<SBuildType, List<Lock>> buildTypes = new TreeMap<>(new BuildTypeComparator(myProjectManager));
    final Map<BuildTypeTemplate, List<Lock>> templates = new TreeMap<>(new TemplateComparator(myProjectManager.getProjectsComparator()));
    final SProject project = findProject(currentProjectId);
    if (project != null) {
```

## RuleId[id=JavadocReference]
### JavadocReference
Cannot resolve symbol `SProject`
in `server/src/jetbrains/buildServer/sharedResources/server/feature/Resources.java`
#### Snippet
```java
   * Gets all resources for project with given {@code projectId} and all its ancestors
   *
   * {@link #getResources(SProject)} cannot be used in runtime, as it requires project to be present,
   * which makes this method a convenient single point, where we acquire project by project id
   *
```

## RuleId[id=SuspiciousMethodCalls]
### SuspiciousMethodCalls
'Map\>' may not contain keys of type ''
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/ResourceAffinity.java`
#### Snippet
```java
      iterator.advance();
      if (!currentPromotionIds.contains(iterator.key())) {
        Optional.ofNullable(iterator.value()).ifPresent(it -> it.forEach(resourceId -> myLockedValues.get(resourceId).remove(iterator.key())));
        iterator.remove();
      }
```

### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java
      if (chainTakenLock != null) {
        result.put(rc, new TakenLock(rc,
                                     CollectionsUtil.filterMapByKeys(tl.getReadLocks(), key -> !chainTakenLock.containsKey(key)),
                                     CollectionsUtil.filterMapByKeys(tl.getWriteLocks(), key -> !chainTakenLock.containsKey(key))));
      } else {
```

### SuspiciousMethodCalls
'Map' may not contain keys of type ''
in `server/src/jetbrains/buildServer/sharedResources/server/runtime/TakenLocksImpl.java`
#### Snippet
```java
        result.put(rc, new TakenLock(rc,
                                     CollectionsUtil.filterMapByKeys(tl.getReadLocks(), key -> !chainTakenLock.containsKey(key)),
                                     CollectionsUtil.filterMapByKeys(tl.getWriteLocks(), key -> !chainTakenLock.containsKey(key))));
      } else {
        result.put(rc, tl);
```

## RuleId[id=JavadocDeclaration]
### JavadocDeclaration
`@param request` tag description is missing
in `server/src/jetbrains/buildServer/sharedResources/pages/ResourceHelper.java`
#### Snippet
```java
  /**
   * Gets parameters from request, that are necessary to create a new resource
   * @param request
   * @return
   */
```

### JavadocDeclaration
`@return` tag description is missing
in `server/src/jetbrains/buildServer/sharedResources/pages/ResourceHelper.java`
#### Snippet
```java
   * Gets parameters from request, that are necessary to create a new resource
   * @param request
   * @return
   */
  @Nullable
```

## RuleId[id=CStyleArrayDeclaration]
### CStyleArrayDeclaration
C-style array declaration of local variable `c`
in `server/src/jetbrains/buildServer/sharedResources/server/report/UsedResourcesSerializer.java`
#### Snippet
```java
    String name = field.getName();
    if (name.startsWith("my")) {
      char c[] = name.substring(2).toCharArray();
      c[0] = Character.toLowerCase(c[0]);
      return new String(c);
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

