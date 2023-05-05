# teamcity-fxcop 
 
# Bad smells
I found 17 bad smells with 2 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 6 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| ToArrayCallWithZeroLengthArrayArgument | 1 | true |
| CharsetObjectCanBeUsed | 1 | false |
| DuplicatedCode | 1 | false |
| RegExpSimplifiable | 1 | false |
| IOStreamConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| ConstantValue | 1 | false |
| SpringBeanNameConventionInspection | 1 | false |
| SpringFacetInspection | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'FxCopPropertiesExtension'#treeend

*** ** * ** ***

|------------------------------------|---|-----------------------------------------|
| **FxCopPropertiesExtension(...):** |   | **Bean:**                               |
| ExtensionHolder extensionHolder    |   | **???**                                 |
| FxCopSearcher searcher             |   | Autowired: FxCopSearcher(FxCopSearcher) |
in `fxcop-agent/src/META-INF/build-agent-plugin-fxcop.xml`
#### Snippet
```java
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="FxCopPropertiesExtension" class="jetbrains.buildServer.fxcop.agent.FxCopPropertiesExtension" />
  <bean name="FxCopInspectionsProcessor" class="jetbrains.buildServer.fxcop.agent.FxCopDataProcessor" />
  <bean name="FxCopRunner" class="jetbrains.buildServer.fxcop.agent.FxCopBuildServiceFactory" />
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FxCopDataProcessor'#treeend

*** ** * ** ***

|------------------------------|---|-----------|
| **FxCopDataProcessor(...):** |   | **Bean:** |
| InspectionReporter reporter  |   | **???**   |
in `fxcop-agent/src/META-INF/build-agent-plugin-fxcop.xml`
#### Snippet
```java
       default-autowire="constructor">
  <bean name="FxCopPropertiesExtension" class="jetbrains.buildServer.fxcop.agent.FxCopPropertiesExtension" />
  <bean name="FxCopInspectionsProcessor" class="jetbrains.buildServer.fxcop.agent.FxCopDataProcessor" />
  <bean name="FxCopRunner" class="jetbrains.buildServer.fxcop.agent.FxCopBuildServiceFactory" />
  <bean name="FxCopSearcher" class="jetbrains.buildServer.fxcop.agent.FxCopSearcher"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FxCopBuildServiceFactory'#treeend

*** ** * ** ***

|----------------------------------------|---|-----------|
| **FxCopBuildServiceFactory(...):**     |   | **Bean:** |
| ArtifactsWatcher artifactsWatcher      |   | **???**   |
| InspectionReporter inspectionsReporter |   | **???**   |
in `fxcop-agent/src/META-INF/build-agent-plugin-fxcop.xml`
#### Snippet
```java
  <bean name="FxCopPropertiesExtension" class="jetbrains.buildServer.fxcop.agent.FxCopPropertiesExtension" />
  <bean name="FxCopInspectionsProcessor" class="jetbrains.buildServer.fxcop.agent.FxCopDataProcessor" />
  <bean name="FxCopRunner" class="jetbrains.buildServer.fxcop.agent.FxCopBuildServiceFactory" />
  <bean name="FxCopSearcher" class="jetbrains.buildServer.fxcop.agent.FxCopSearcher"/>
</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FxCopSearcher'#treeend

*** ** * ** ***

|-------------------------------------------------|---|-----------|
| **FxCopSearcher(...):**                         |   | **Bean:** |
| Win32RegistryAccessor registryAccessor          |   | **???**   |
| BuildAgentConfiguration buildAgentConfiguration |   | **???**   |
| ExtensionHolder extensionHolder                 |   | **???**   |
in `fxcop-agent/src/META-INF/build-agent-plugin-fxcop.xml`
#### Snippet
```java
  <bean name="FxCopInspectionsProcessor" class="jetbrains.buildServer.fxcop.agent.FxCopDataProcessor" />
  <bean name="FxCopRunner" class="jetbrains.buildServer.fxcop.agent.FxCopBuildServiceFactory" />
  <bean name="FxCopSearcher" class="jetbrains.buildServer.fxcop.agent.FxCopSearcher"/>
</beans>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FxCopRunType'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **FxCopRunType(...):**            |   | **Bean:** |
| RunTypeRegistry runTypeRegistry   |   | **???**   |
| PluginDescriptor pluginDescriptor |   | **???**   |
in `fxcop-server/src/META-INF/build-server-plugin-fxcop.xml`
#### Snippet
```java
           default-autowire="constructor">

  <bean id="fxcopRunType" class="jetbrains.buildServer.fxcop.server.FxCopRunType"/>
  <bean id="FxCopReportTab" class="jetbrains.buildServer.fxcop.server.FxCopReportTab"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'FxCopReportTab'#treeend

*** ** * ** ***

|-------------------------------------------------------------|---|-----------|
| **FxCopReportTab(...):**                                    |   | **Bean:** |
| PagePlaces pagePlaces                                       |   | **???**   |
| SBuildServer server                                         |   | **???**   |
| ReportTabsIsolationProtection reportTabsIsolationProtection |   | **???**   |
in `fxcop-server/src/META-INF/build-server-plugin-fxcop.xml`
#### Snippet
```java

  <bean id="fxcopRunType" class="jetbrains.buildServer.fxcop.server.FxCopRunType"/>
  <bean id="FxCopReportTab" class="jetbrains.buildServer.fxcop.server.FxCopReportTab"/>

</beans>
```

## RuleId[id=ToArrayCallWithZeroLengthArrayArgument]
### ToArrayCallWithZeroLengthArrayArgument
Call to `toArray()` with pre-sized array argument 'new String\[split.size()\]'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopBuildService.java`
#### Snippet
```java
      final String filesStringWithSpaces = string.replace('\n', ' ').replace('\r', ' ').replace('\\', '/');
      final List<String> split = StringUtil.splitCommandArgumentsAndUnquote(filesStringWithSpaces);
      return split.toArray(new String[split.size()]);
    }

```

## RuleId[id=CharsetObjectCanBeUsed]
### CharsetObjectCanBeUsed
StandardCharsets.UTF_8 can be used instead
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
  private void handleFile() throws IOException {
    Reader reader = new BufferedReader(
      new InputStreamReader(new FileInputStream(myFxCopReport), "UTF8"));

    try {
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopMsBuildSearch.java`
#### Snippet
```java
    return CollectionsUtil.filterAndConvertCollection(msBuildTools.descendingSet(), new Converter<File, String>() {
      @Override
      public File createFrom(@NotNull final String name) {
        return new File(parameters.get(name), FXCOP_EXE_RELATIVE_PATH);
      }
    }, new Filter<String>() {
      @Override
      public boolean accept(@NotNull final String name) {
        return StringUtil.isNotEmpty(parameters.get(name));
      }
    });
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `fxcop-agent/src/META-INF/build-agent-plugin-fxcop.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">
  <bean name="FxCopPropertiesExtension" class="jetbrains.buildServer.fxcop.agent.FxCopPropertiesExtension" />
  <bean name="FxCopInspectionsProcessor" class="jetbrains.buildServer.fxcop.agent.FxCopDataProcessor" />
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `fxcop-server/src/META-INF/build-server-plugin-fxcop.xml`
#### Snippet
```java
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">

  <bean id="fxcopRunType" class="jetbrains.buildServer.fxcop.server.FxCopRunType"/>
```

## RuleId[id=RegExpSimplifiable]
### RegExpSimplifiable
`[\\d]` can be simplified to '\\d'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopVisualStudioSearch.java`
#### Snippet
```java
  static final String FXCOP_RELATIVE_PATH = "../../Team Tools/Static Analysis Tools/FxCop/";
  private static final String FXCOP_EXE_RELATIVE_PATH = FXCOP_RELATIVE_PATH + FxCopConstants.FXCOPCMD_BINARY;
  private static final Pattern VISUAL_STUDIO_PATTERN = Pattern.compile("VS[\\d]+_Path");

  @NotNull
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'InputStream' can be constructed using 'Files.newInputStream()'
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
  private void handleFile() throws IOException {
    Reader reader = new BufferedReader(
      new InputStreamReader(new FileInputStream(myFxCopReport), "UTF8"));

    try {
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopFileProcessor.java`
#### Snippet
```java
      } catch (IllegalAccessException e) {
        Loggers.AGENT.debug(getMessage(nodeName), e);
        myLogger.error(getMessage(nodeName) + ":" + e.toString());
      } catch (RuntimeException e) {
        // Java 9
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `fxcopBinary == null` is always `false`
in `fxcop-agent/src/jetbrains/buildServer/fxcop/agent/FxCopRegistrySearch.java`
#### Snippet
```java

    final String fxcopBinary = extractFxCopBinary(fxcopStartCmd);
    if (fxcopBinary == null) {
      LOG.warn("Can't extract fxcop binary from: " + fxcopStartCmd);
      return Collections.emptyList();
```

## RuleId[id=SpringBeanNameConventionInspection]
### SpringBeanNameConventionInspection
'FxCopReportTab' should start with lowercase letter
in `fxcop-server/src/META-INF/build-server-plugin-fxcop.xml`
#### Snippet
```java

  <bean id="fxcopRunType" class="jetbrains.buildServer.fxcop.server.FxCopRunType"/>
  <bean id="FxCopReportTab" class="jetbrains.buildServer.fxcop.server.FxCopReportTab"/>

</beans>
```

## RuleId[id=SpringFacetInspection]
### SpringFacetInspection
Application context not configured for this file
in `fxcop-server/src/META-INF/build-server-plugin-fxcop.xml`
#### Snippet
```java
<?xml version="1.0" encoding="UTF-8"?>
<!--
  ~ Copyright 2000-2023 JetBrains s.r.o.
  ~
  ~ Licensed under the Apache License, Version 2.0 (the "License");
  ~ you may not use this file except in compliance with the License.
  ~ You may obtain a copy of the License at
  ~
  ~ http://www.apache.org/licenses/LICENSE-2.0
  ~
  ~ Unless required by applicable law or agreed to in writing, software
  ~ distributed under the License is distributed on an "AS IS" BASIS,
  ~ WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  ~ See the License for the specific language governing permissions and
  ~ limitations under the License.
  -->
<beans     xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">

  <bean id="fxcopRunType" class="jetbrains.buildServer.fxcop.server.FxCopRunType"/>
  <bean id="FxCopReportTab" class="jetbrains.buildServer.fxcop.server.FxCopReportTab"/>

</beans>
```

