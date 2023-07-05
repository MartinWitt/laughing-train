# teamcity-powershell 
 
# Bad smells
I found 19 bad smells with 0 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringXmlModelInspection | 5 | false |
| SpringBeanConstructorArgInspection | 4 | false |
| JavadocLinkAsPlainText | 4 | false |
| SpringXmlAutowireExplicitlyInspection | 3 | false |
| IOStreamConstructor | 1 | false |
| UNUSED_IMPORT | 1 | false |
| CommentedOutCode | 1 | false |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'PowerShellRunType'#treeend

*** ** * ** ***

|-----------------------------|---|-----------|
| **PowerShellRunType(...):** |   | **Bean:** |
| RunTypeRegistry reg         |   | **???**   |
| PluginDescriptor descriptor |   | **???**   |
in `powershell-server/src/main/resources/META-INF/build-server-plugin-powershell.xml`
#### Snippet
```java
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.powershell.server.PowerShellRunType"/>
  <bean class="jetbrains.buildServer.powershell.server.PowerShellRunnerDiscoverer"/>

```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'PowerShellInfoProvider'#treeend

*** ** * ** ***

|-----------------------------------------------------------|---|----------------------------------------------------------------------------------|
| **PowerShellInfoProvider(...):**                          |   | **Bean:**                                                                        |
| BuildAgentConfiguration config                            |   | **???**                                                                          |
| ExtensionHolder extensionHolder                           |   | **???**                                                                          |
| List\<PowerShellDetector\> detectors                      |   | Autowired: null(CommandLinePowerShellDetector); null(RegistryPowerShellDetector) |
| EventDispatcher\<AgentLifeCycleListener\> eventDispatcher |   | **???**                                                                          |
| ShellInfoHolder holder                                    |   | Autowired: null(ShellInfoHolder)                                                 |
in `powershell-agent/src/main/resources/META-INF/build-agent-plugin-powershell.xml`
#### Snippet
```java
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.powershell.agent.PowerShellInfoProvider"/>
  <bean class="jetbrains.buildServer.powershell.agent.ShellInfoHolder"/>
  <bean class="jetbrains.buildServer.powershell.agent.PowerShellCommandLineProvider"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RegistryPowerShellDetector'#treeend

*** ** * ** ***

|--------------------------------------|---|-----------|
| **RegistryPowerShellDetector(...):** |   | **Bean:** |
| Win32RegistryAccessor accessor       |   | **???**   |
in `powershell-agent/src/main/resources/META-INF/build-agent-plugin-powershell.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.powershell.agent.PowerShellServiceFactory"/>

  <bean class="jetbrains.buildServer.powershell.agent.detect.registry.RegistryPowerShellDetector"/>
  <bean class="jetbrains.buildServer.powershell.agent.detect.cmd.DetectionRunner"/>
  <bean class="jetbrains.buildServer.powershell.agent.detect.cmd.DetectionPaths"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'CommandLinePowerShellDetector'#treeend

*** ** * ** ***

|-----------------------------------------|---|----------------------------------|
| **CommandLinePowerShellDetector(...):** |   | **Bean:**                        |
| BuildAgentConfiguration configuration   |   | **???**                          |
| DetectionRunner runner                  |   | Autowired: null(DetectionRunner) |
| DetectionPaths detectionPaths           |   | Autowired: null(DetectionPaths)  |
in `powershell-agent/src/main/resources/META-INF/build-agent-plugin-powershell.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.powershell.agent.detect.cmd.DetectionRunner"/>
  <bean class="jetbrains.buildServer.powershell.agent.detect.cmd.DetectionPaths"/>
  <bean class="jetbrains.buildServer.powershell.agent.detect.cmd.CommandLinePowerShellDetector"/>

</beans>
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `powershell-server/src/main/resources/META-INF/build-server-plugin-powershell.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.powershell.server.PowerShellRunType"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `powershell-server/fake-teamcity-server-plugin-context.xml`
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
in `powershell-agent/src/main/resources/META-INF/build-agent-plugin-powershell.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-2.5.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.powershell.agent.PowerShellInfoProvider"/>
```

## RuleId[id=IOStreamConstructor]
### IOStreamConstructor
'OutputStream' can be constructed using 'Files.newOutputStream()'
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/ScriptGenerator.java`
#### Snippet
```java
    try {
      file = FileUtil.createTempFile(buildTempDir, "powershell", ".ps1", true);
      OutputStreamWriter w = new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8);
      handle = w;
      if (PowerShellExecutionMode.PS1 == PowerShellExecutionMode.fromString(runnerParameters.get(RUNNER_EXECUTION_MODE))) {
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import com.intellij.execution.configurations.ParametersList;`
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/PowerShellCommandLineProvider.java`
#### Snippet
```java
package jetbrains.buildServer.powershell.agent;

import com.intellij.execution.configurations.ParametersList;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.SystemInfo;
```

## RuleId[id=CommentedOutCode]
### CommentedOutCode
Commented out code (4 lines)
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/ScriptGenerator.java`
#### Snippet
```java
      }
      sourceScript = convertLineSeparators(sourceScript, "\r\n");
      /*if (PowerShellExecutionMode.STDIN.equals(PowerShellExecutionMode.fromString(runnerParameters.get(RUNNER_EXECUTION_MODE)))) {
        //some newlines are necessary to workaround -Command - issues, like TW-19771
        sourceScript = "  \r\n  \r\n  \r\n" + sourceScript + "\r\n  \r\n   \r\n   ";
```

## RuleId[id=JavadocLinkAsPlainText]
### JavadocLinkAsPlainText
Link specified as plain text
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/DetectionPaths.java`
#### Snippet
```java

  /**
   * https://docs.microsoft.com/en-us/powershell/scripting/setup/installing-powershell-core-on-windows?view=powershell-5.1
   * <p>
   * By default, the package is installed to $env:ProgramFiles\PowerShell\
```

### JavadocLinkAsPlainText
Link specified as plain text
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/cmd/DetectionPaths.java`
#### Snippet
```java
  /**
   * Paths, recommended by the documentation for .tar.gz install
   * https://docs.microsoft.com/en-us/powershell/scripting/install/installing-powershell-core-on-linux?view=powershell-7.1
   */
  private static final List<String> ADDITIONAL_ROOTS = Collections.singletonList(
```

### JavadocLinkAsPlainText
Link specified as plain text
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/detect/registry/PowerShellRegistry.java`
#### Snippet
```java
 *
 * Implements PowerShell detection logic is described at
 * http://blogs.msdn.com/b/powershell/archive/2009/06/25/detection-logic-poweshell-installation.aspx
 *
 * @author Eugene Petrenko (eugene.petrenko@jetbrains.com)
```

### JavadocLinkAsPlainText
Link specified as plain text
in `powershell-agent/src/main/java/jetbrains/buildServer/powershell/agent/system/PowerShellCommands.java`
#### Snippet
```java
   * Windows is 64bit, Java process is 32 bit, PowerShell x64 is required
   *
   * @link http://www.samlogic.net/articles/sysnative-folder-64-bit-windows.htm
   *
   * @param info powershell info
```

## RuleId[id=SpringXmlModelInspection]
### SpringXmlModelInspection
Cannot resolve class or package 'jetbrains'
in `powershell-server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IntelliJ IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'buildServer'
in `powershell-server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IntelliJ IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'web'
in `powershell-server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IntelliJ IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class or package 'openapi'
in `powershell-server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IntelliJ IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

### SpringXmlModelInspection
Cannot resolve class 'PluginDescriptor'
in `powershell-server/fake-teamcity-server-plugin-context.xml`
#### Snippet
```java
       default-autowire="constructor">
  <!-- this is a fake spring context xml to make IntelliJ IDEA know all implicit beans that are available for plugin -->
  <bean class="jetbrains.buildServer.web.openapi.PluginDescriptor"/>
</beans>

```

