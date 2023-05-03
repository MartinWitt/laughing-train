# teamcity-runas-plugin 
 
# Bad smells
I found 59 bad smells with 5 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| SpringBeanConstructorArgInspection | 17 | false |
| UNUSED_IMPORT | 9 | false |
| UnnecessaryModifier | 4 | true |
| DuplicatedCode | 3 | false |
| Deprecation | 3 | false |
| ArraysAsListWithZeroOrOneArgument | 3 | false |
| ConstantValue | 3 | false |
| FieldMayBeFinal | 2 | false |
| SpringJavaInjectionPointsAutowiringInspection | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| UNCHECKED_WARNING | 1 | false |
| DataFlowIssue | 1 | false |
| StringOperationCanBeSimplified | 1 | false |
| RegExpRedundantEscape | 1 | false |
| DuplicateBranchesInSwitch | 1 | false |
| CollectionAddAllCanBeReplacedWithConstructor | 1 | false |
| UnnecessaryToStringCall | 1 | true |
| UnusedAssignment | 1 | false |
| NullableProblems | 1 | false |
| UseBulkOperation | 1 | false |
| FieldCanBeLocal | 1 | false |
## RuleId[id=UnnecessaryModifier]
### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResource.java`
#### Snippet
```java

public interface AccessControlResource extends CommandLineResource {
  public void setAcl(@NotNull final AccessControlList accessControlList);
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `runAs-common/src/main/java/jetbrains/buildServer/runAs/common/WindowsIntegrityLevel.java`
#### Snippet
```java
  private final String myDescription;

  private WindowsIntegrityLevel(String value, final String description) {
    myValue = value;
    myDescription = description;
```

### UnnecessaryModifier
Modifier `public` is redundant for interface members
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessService.java`
#### Snippet
```java

public interface FileAccessService {
  public Iterable<Result<AccessControlEntry, Boolean>> setAccess(@NotNull final AccessControlList accessControlList);
}

```

### UnnecessaryModifier
Modifier `private` is redundant for enum constructors
in `runAs-common/src/main/java/jetbrains/buildServer/runAs/common/LoggingLevel.java`
#### Snippet
```java
  private final String myDescription;

  private LoggingLevel(String value, final String description) {
    myValue = value;
    myDescription = description;
```

## RuleId[id=UNCHECKED_WARNING]
### UNCHECKED_WARNING
Unchecked assignment: 'java.util.List' to 'java.util.List'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsParams.java`
#### Snippet
```java

  public List<CommandLineArgument> getCommandLineArguments() {
    return myCommandLineArguments;
  }

```

## RuleId[id=DataFlowIssue]
### DataFlowIssue
Method invocation `getExitCode` may produce `NullPointerException`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
      try {
        final ExecResult res = myCommandLineExecutor.runProcess(scriptCmd, 600);
        if (res.getExitCode() != 0) {
          LOG.warn("RunAs is not supported");
          return;
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlList.java`
#### Snippet
```java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
```

### UNUSED_IMPORT
Unused import `import java.util.LinkedHashSet;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlList.java`
#### Snippet
```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class AccessControlList implements Iterable<AccessControlEntry> {
```

### UNUSED_IMPORT
Unused import `import org.jetbrains.annotations.Nullable;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlListProvider.java`
#### Snippet
```java

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface AccessControlListProvider {
```

### UNUSED_IMPORT
Unused import `import java.util.ArrayList;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResourceImpl.java`
#### Snippet
```java
package jetbrains.buildServer.runAs.agent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
```

### UNUSED_IMPORT
Unused import `import java.util.HashMap;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResourceImpl.java`
#### Snippet
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineExecutionContext;
```

### UNUSED_IMPORT
Unused import `import java.util.List;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlResourceImpl.java`
#### Snippet
```java
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineExecutionContext;
import org.jetbrains.annotations.NotNull;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.ExecResult;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessService.java`
#### Snippet
```java
package jetbrains.buildServer.runAs.agent;

import jetbrains.buildServer.ExecResult;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.dotNet.buildRunner.agent.RunnerParametersService;`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsSetupBuilder.java`
#### Snippet
```java
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineSetup;
import jetbrains.buildServer.dotNet.buildRunner.agent.CommandLineSetupBuilder;
import jetbrains.buildServer.dotNet.buildRunner.agent.RunnerParametersService;
import org.jetbrains.annotations.NotNull;

```

### UNUSED_IMPORT
Unused import `import java.util.Collection;`
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsBean.java`
#### Snippet
```java

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import jetbrains.buildServer.runAs.common.Constants;
```

## RuleId[id=StringOperationCanBeSimplified]
### StringOperationCanBeSimplified
Unnecessary string length argument
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/ConfigurationImpl.java`
#### Snippet
```java

          String key = line.substring(0, index).trim();
          String value = line.substring(index + 1, line.length()).trim();
          myMap.put(key, value);
      }
```

## RuleId[id=FieldMayBeFinal]
### FieldMayBeFinal
Field `myContext` may be 'final'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/Result.java`
#### Snippet
```java
public class Result<TContext, TValue> {
  @NotNull private final boolean myIsSuccessful;
  @NotNull private TContext myContext;
  @Nullable private TValue myValue;
  @Nullable private Exception myError;
```

### FieldMayBeFinal
Field `myRunAsConfiguration` may be 'final'
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsBeanDefinitionRegistryPostProcessor.java`
#### Snippet
```java

public class RunAsBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
  private RunAsConfiguration myRunAsConfiguration;

  public RunAsBeanDefinitionRegistryPostProcessor(@NotNull final RunAsConfiguration runAsConfiguration) {
```

## RuleId[id=RegExpRedundantEscape]
### RegExpRedundantEscape
Redundant character escape `\\+` in RegExp
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/FileAccessParser.java`
#### Snippet
```java
public class FileAccessParser implements TextParser<AccessControlList> {
  private static final Logger LOG = Logger.getInstance(FileAccessParser.class.getName());
  private static final Pattern OutAccessPattern = Pattern.compile("\\s*([gbsrcua\\s]+)\\s*([\\+\\-rwx\\s]+)\\s*,(.+)", Pattern.CASE_INSENSITIVE);

  @NotNull
```

## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'PathsServiceImpl'#treeend

*** ** * ** ***

|---------------------------------------------------------|---|-----------|
| **PathsServiceImpl(...):**                              |   | **Bean:** |
| FileService fileService                                 |   | **???**   |
| BuildAgentConfiguration buildAgentConfiguration         |   | **???**   |
| BuildAgentConfigurablePaths buildAgentConfigurablePaths |   | **???**   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java

  <bean class="jetbrains.buildServer.runAs.agent.EnvironmentImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.PathsServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.AccessControlListProviderImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.CryptographicServiceImpl" />
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'SecuredLoggingServiceImpl'#treeend

*** ** * ** ***

|--------------------------------------------|---|-----------|
| **SecuredLoggingServiceImpl(...):**        |   | **Bean:** |
| BuildRunnerContextProvider contextProvider |   | **???**   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.CryptographicServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.FileAccessParser" />
  <bean class="jetbrains.buildServer.runAs.agent.SecuredLoggingServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.CommandLineExecutorImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.RunAsPropertiesExtension" >
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RunAsPropertiesExtension'#treeend

*** ** * ** ***

|-------------------------------------------------------|---|-----------------------------------------------|
| **RunAsPropertiesExtension(...):**                    |   | **Bean:**                                     |
| EventDispatcher\<AgentLifeCycleListener\> events      |   | **???**                                       |
| ToolProvidersRegistry toolProvidersRegistry           |   | **???**                                       |
| BuildRunnerContextProvider buildRunnerContextProvider |   | **???**                                       |
| CommandLineExecutor commandLineExecutor               |   | Autowired: null(CommandLineExecutorImpl)      |
| ProfileParametersService profileParametersService     |   | Autowired: null(ProfileParametersServiceImpl) |
| FileAccessCacheManager buildFileAccessCacheManager    |   | \<constructor-arg ref="buildAccessCache"/\>   |
| Environment environment                               |   | Autowired: null(EnvironmentImpl)              |
| ExtensionHolder extensionHolder                       |   | **???**                                       |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.SecuredLoggingServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.CommandLineExecutorImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.RunAsPropertiesExtension" >
    <constructor-arg ref="buildAccessCache"/>
  </bean>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RunAsToolProvider'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **RunAsToolProvider(...):**                 |   | **Bean:** |
| PluginDescriptor pluginDescriptor           |   | **???**   |
| ToolProvidersRegistry toolProvidersRegistry |   | **???**   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
    <constructor-arg ref="buildAccessCache"/>
  </bean>
  <bean class="jetbrains.buildServer.runAs.agent.RunAsToolProvider" />
  <bean class="jetbrains.buildServer.runAs.agent.RunAsLoggerImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.BuildFeatureParametersServiceImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RunAsLoggerImpl'#treeend

*** ** * ** ***

|-------------------------------------------------|---|--------------------------------------------|
| **RunAsLoggerImpl(...):**                       |   | **Bean:**                                  |
| LoggerService loggerService                     |   | **???**                                    |
| PathsService pathsService                       |   | Autowired: null(PathsServiceImpl)          |
| SecuredLoggingService securedLoggingService     |   | Autowired: null(SecuredLoggingServiceImpl) |
| RunnerParametersService runnerParametersService |   | **???**                                    |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  </bean>
  <bean class="jetbrains.buildServer.runAs.agent.RunAsToolProvider" />
  <bean class="jetbrains.buildServer.runAs.agent.RunAsLoggerImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.BuildFeatureParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.AgentParametersServiceImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'BuildFeatureParametersServiceImpl'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **BuildFeatureParametersServiceImpl(...):** |   | **Bean:** |
| BuildRunnerContextProvider contextProvider  |   | **???**   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.RunAsToolProvider" />
  <bean class="jetbrains.buildServer.runAs.agent.RunAsLoggerImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.BuildFeatureParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.AgentParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.ProfileParametersServiceImpl" />
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'AgentParametersServiceImpl'#treeend

*** ** * ** ***

|--------------------------------------------|---|-----------|
| **AgentParametersServiceImpl(...):**       |   | **Bean:** |
| BuildRunnerContextProvider contextProvider |   | **???**   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.RunAsLoggerImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.BuildFeatureParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.AgentParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.ProfileParametersServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.ParametersServiceImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ProfileParametersServiceImpl'#treeend

*** ** * ** ***

|------------------------------------------------|---|---------------------------------------------|
| **ProfileParametersServiceImpl(...):**         |   | **Bean:**                                   |
| AgentParametersService runnerParametersService |   | Autowired: null(AgentParametersServiceImpl) |
| PathsService pathsService                      |   | Autowired: null(PathsServiceImpl)           |
| FileService fileService                        |   | **???**                                     |
| CryptographicService cryptographicService      |   | Autowired: null(CryptographicServiceImpl)   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.BuildFeatureParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.AgentParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.ProfileParametersServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.ParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.UserCredentialsServiceImpl"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ParametersServiceImpl'#treeend

*** ** * ** ***

|-------------------------------------------------------------|---|----------------------------------------------------|
| **ParametersServiceImpl(...):**                             |   | **Bean:**                                          |
| RunnerParametersService runnerParametersService             |   | **???**                                            |
| BuildFeatureParametersService buildFeatureParametersService |   | Autowired: null(BuildFeatureParametersServiceImpl) |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.AgentParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.ProfileParametersServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.ParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.UserCredentialsServiceImpl"/>
  <bean class="jetbrains.buildServer.dotNet.buildRunner.agent.BeforeBuildPublisher" id="beforeBuildPublisher"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'UserCredentialsServiceImpl'#treeend

*** ** * ** ***

|---------------------------------------------------------|---|-----------------------------------------------|
| **UserCredentialsServiceImpl(...):**                    |   | **Bean:**                                     |
| ParametersService parametersService                     |   | Autowired: null(ParametersServiceImpl)        |
| ProfileParametersService profileParametersService       |   | Autowired: null(ProfileParametersServiceImpl) |
| CommandLineArgumentsService commandLineArgumentsService |   | **???**                                       |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.ProfileParametersServiceImpl" />
  <bean class="jetbrains.buildServer.runAs.agent.ParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.UserCredentialsServiceImpl"/>
  <bean class="jetbrains.buildServer.dotNet.buildRunner.agent.BeforeBuildPublisher" id="beforeBuildPublisher"/>
  <bean class="jetbrains.buildServer.runAs.agent.NoModificationArgumentConverter" id="noModificationArgumentConverter"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'BeforeBuildPublisher'#treeend

*** ** * ** ***

|--------------------------------------------|---|-----------|
| **BeforeBuildPublisher(...):**             |   | **Bean:** |
| BuildRunnerContextProvider contextProvider |   | **???**   |
| FileService fileService                    |   | **???**   |
| LoggerService loggerService                |   | **???**   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.ParametersServiceImpl"/>
  <bean class="jetbrains.buildServer.runAs.agent.UserCredentialsServiceImpl"/>
  <bean class="jetbrains.buildServer.dotNet.buildRunner.agent.BeforeBuildPublisher" id="beforeBuildPublisher"/>
  <bean class="jetbrains.buildServer.runAs.agent.NoModificationArgumentConverter" id="noModificationArgumentConverter"/>
  <bean class="jetbrains.buildServer.runAs.agent.FileAccessCacheImpl" id="globalAccessCache"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RunAsBuildCommandLineProcessorAdapter'#treeend

*** ** * ** ***

|---------------------------------------------------------|---|----------------------------------------------|
| **RunAsBuildCommandLineProcessorAdapter(...):**         |   | **Bean:**                                    |
| CommandLineSetupBuilder setupBuilder                    |   | \<constructor-arg ref="runAsSetupBuilder"/\> |
| BuildRunnerContextProvider contextProvider              |   | **???**                                      |
| AgentEventDispatcher eventDispatcher                    |   | **???**                                      |
| ExceptionHandler exceptionHandler                       |   | **???**                                      |
| CommandLineArgumentsService commandLineArgumentsService |   | **???**                                      |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  </bean>

  <bean class="jetbrains.buildServer.runAs.agent.RunAsBuildCommandLineProcessorAdapter" id="runAsBuildCommandLineProcessorAdapter">
    <constructor-arg ref="runAsSetupBuilder"/>
  </bean>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ScopedFileAccessService'#treeend

*** ** * ** ***

|---------------------------------------|---|-----------------------------------------------------|
| **ScopedFileAccessService(...):**     |   | **Bean:**                                           |
| FileAccessService fileAccessService   |   | \<constructor-arg ref="windowsFileAccessService"/\> |
| LoggerService loggerService           |   | **???**                                             |
| FileAccessCache globalFileAccessCache |   | \<constructor-arg ref="globalAccessCache"/\>        |
| FileAccessCache buildFileAccessCache  |   | \<constructor-arg ref="buildAccessCache"/\>         |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.WindowsArgumentConverter" id="windowsArgumentConverter"/>
  <bean class="jetbrains.buildServer.runAs.agent.WindowsFileAccessService" id="windowsFileAccessService"/>
  <bean class="jetbrains.buildServer.runAs.agent.ScopedFileAccessService" id="windowsScopedFileAccessService">
    <constructor-arg ref="globalAccessCache"/>
    <constructor-arg ref="buildAccessCache"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RunAsPlatformSpecificSetupBuilder'#treeend

*** ** * ** ***

|---------------------------------------------------------------|---|-----------------------------------------------------------|
| **RunAsPlatformSpecificSetupBuilder(...):**                   |   | **Bean:**                                                 |
| UserCredentialsService userCredentialsService                 |   | Autowired: null(UserCredentialsServiceImpl)               |
| RunnerParametersService runnerParametersService               |   | **???**                                                   |
| FileService fileService                                       |   | **???**                                                   |
| BuildAgentSystemInfo buildAgentSystemInfo                     |   | **???**                                                   |
| AccessControlListProvider accessControlListProvider           |   | Autowired: null(AccessControlListProviderImpl)            |
| ResourcePublisher beforeBuildPublisher                        |   | \<constructor-arg ref="beforeBuildPublisher"/\>           |
| AccessControlResource accessControlResource                   |   | \<constructor-arg ref="windowsAccessControlResource"/\>   |
| ResourceGenerator\<UserCredentials\> userCredentialsGenerator |   | \<constructor-arg ref="windowsSettingsGenerator"/\>       |
| ResourceGenerator\<RunAsParams\> runAsCmdGenerator            |   | \<constructor-arg ref="cmdGenerator"/\>                   |
| FileAccessService fileAccessService                           |   | \<constructor-arg ref="windowsScopedFileAccessService"/\> |
| RunAsLogger runAsLogger                                       |   | Autowired: null(RunAsLoggerImpl)                          |
| RunAsAccessService runAsAccessService                         |   | Autowired: null(RunAsPropertiesExtension)                 |
| Converter\<String, String\> argumentConverter                 |   | \<constructor-arg ref="windowsArgumentConverter"/\>       |
| String commandFileExtension                                   |   | \<constructor-arg type="java.lang.String" value=".cmd"/\> |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  </bean>
  <bean class="jetbrains.buildServer.runAs.agent.WindowsSettingsGenerator" id="windowsSettingsGenerator"/>
  <bean class="jetbrains.buildServer.runAs.agent.RunAsPlatformSpecificSetupBuilder" id="runAsWindowsSetupBuilder">
    <constructor-arg ref="beforeBuildPublisher"/>
    <constructor-arg ref="windowsAccessControlResource"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'ScopedFileAccessService'#treeend

*** ** * ** ***

|---------------------------------------|---|---------------------------------------------------|
| **ScopedFileAccessService(...):**     |   | **Bean:**                                         |
| FileAccessService fileAccessService   |   | \<constructor-arg ref="linuxFileAccessService"/\> |
| LoggerService loggerService           |   | **???**                                           |
| FileAccessCache globalFileAccessCache |   | \<constructor-arg ref="globalAccessCache"/\>      |
| FileAccessCache buildFileAccessCache  |   | \<constructor-arg ref="buildAccessCache"/\>       |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  <bean class="jetbrains.buildServer.runAs.agent.LinuxArgumentConverter" id="linuxArgumentConverter"/>
  <bean class="jetbrains.buildServer.runAs.agent.LinuxFileAccessService" id="linuxFileAccessService"/>
  <bean class="jetbrains.buildServer.runAs.agent.ScopedFileAccessService" id="linuxScopedFileAccessService">
    <constructor-arg ref="globalAccessCache"/>
    <constructor-arg ref="buildAccessCache"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RunAsPlatformSpecificSetupBuilder'#treeend

*** ** * ** ***

|---------------------------------------------------------------|---|------------------------------------------------------------|
| **RunAsPlatformSpecificSetupBuilder(...):**                   |   | **Bean:**                                                  |
| UserCredentialsService userCredentialsService                 |   | Autowired: null(UserCredentialsServiceImpl)                |
| RunnerParametersService runnerParametersService               |   | **???**                                                    |
| FileService fileService                                       |   | **???**                                                    |
| BuildAgentSystemInfo buildAgentSystemInfo                     |   | **???**                                                    |
| AccessControlListProvider accessControlListProvider           |   | Autowired: null(AccessControlListProviderImpl)             |
| ResourcePublisher beforeBuildPublisher                        |   | \<constructor-arg ref="beforeBuildPublisher"/\>            |
| AccessControlResource accessControlResource                   |   | \<constructor-arg ref="linuxAccessControlResource"/\>      |
| ResourceGenerator\<UserCredentials\> userCredentialsGenerator |   | \<constructor-arg ref="linuxSettingsGenerator"/\>          |
| ResourceGenerator\<RunAsParams\> runAsCmdGenerator            |   | \<constructor-arg ref="shGenerator"/\>                     |
| FileAccessService fileAccessService                           |   | \<constructor-arg ref="linuxScopedFileAccessService"/\>    |
| RunAsLogger runAsLogger                                       |   | Autowired: null(RunAsLoggerImpl)                           |
| RunAsAccessService runAsAccessService                         |   | Autowired: null(RunAsPropertiesExtension)                  |
| Converter\<String, String\> argumentConverter                 |   | \<constructor-arg ref="noModificationArgumentConverter"/\> |
| String commandFileExtension                                   |   | \<constructor-arg type="java.lang.String" value=".sh"/\>   |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
  </bean>
  <bean class="jetbrains.buildServer.runAs.agent.LinuxSettingsGenerator" id="linuxSettingsGenerator"/>
  <bean class="jetbrains.buildServer.runAs.agent.RunAsPlatformSpecificSetupBuilder" id="runAsLinuxSetupBuilder">
    <constructor-arg ref="beforeBuildPublisher"/>
    <constructor-arg ref="linuxAccessControlResource"/>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'RunAsPlatformSpecificSetupBuilder'#treeend

*** ** * ** ***

|---------------------------------------------------------------|---|--------------------------------------------------------------|
| **RunAsPlatformSpecificSetupBuilder(...):**                   |   | **Bean:**                                                    |
| UserCredentialsService userCredentialsService                 |   | Autowired: null(UserCredentialsServiceImpl)                  |
| RunnerParametersService runnerParametersService               |   | **???**                                                      |
| FileService fileService                                       |   | **???**                                                      |
| BuildAgentSystemInfo buildAgentSystemInfo                     |   | **???**                                                      |
| AccessControlListProvider accessControlListProvider           |   | Autowired: null(AccessControlListProviderImpl)               |
| ResourcePublisher beforeBuildPublisher                        |   | \<constructor-arg ref="beforeBuildPublisher"/\>              |
| AccessControlResource accessControlResource                   |   | \<constructor-arg ref="linuxAccessControlResource"/\>        |
| ResourceGenerator\<UserCredentials\> userCredentialsGenerator |   | \<constructor-arg ref="linuxSettingsGenerator"/\>            |
| ResourceGenerator\<RunAsParams\> runAsCmdGenerator            |   | \<constructor-arg ref="shGenerator"/\>                       |
| FileAccessService fileAccessService                           |   | \<constructor-arg ref="linuxScopedFileAccessService"/\>      |
| RunAsLogger runAsLogger                                       |   | Autowired: null(RunAsLoggerImpl)                             |
| RunAsAccessService runAsAccessService                         |   | Autowired: null(RunAsPropertiesExtension)                    |
| Converter\<String, String\> argumentConverter                 |   | \<constructor-arg ref="noModificationArgumentConverter"/\>   |
| String commandFileExtension                                   |   | \<constructor-arg type="java.lang.String" value="_mac.sh"/\> |
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
    <constructor-arg type="java.lang.String" value=".sh"/>
  </bean>
  <bean class="jetbrains.buildServer.runAs.agent.RunAsPlatformSpecificSetupBuilder" id="runAsMacSetupBuilder">
    <constructor-arg ref="beforeBuildPublisher"/>
    <constructor-arg ref="linuxAccessControlResource"/>
```

## RuleId[id=SpringJavaInjectionPointsAutowiringInspection]
### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsBuildFeature.java`
#### Snippet
```java
  private final RunAsBean myBean;

  @Autowired
  public RunAsBuildFeature(
    @NotNull final RunAsBean bean,
```

### SpringJavaInjectionPointsAutowiringInspection
Autowired members must be defined in valid Spring bean (@Component\|@Service\|...)
in `runAs-server/src/main/java/jetbrains/buildServer/runAs/server/RunAsRunTypeExtension.java`
#### Snippet
```java
  private final String myEditUrl;

  @Autowired
  public RunAsRunTypeExtension(
    @NotNull final PluginDescriptor descriptor,
```

## RuleId[id=DuplicateBranchesInSwitch]
### DuplicateBranchesInSwitch
Duplicate branch in 'switch'
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java

        case All:
          permissionsList.add(0, "a+");
          break;

```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `runAs-server/src/main/resources/META-INF/build-server-plugin-runAs.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.runAs.server.RunAsConfiguration"/>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `runAs-agent/src/main/resources/META-INF/build-agent-plugin-runAs.xml`
#### Snippet
```java
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
       default-autowire="constructor">

  <bean class="jetbrains.buildServer.runAs.agent.EnvironmentImpl" />
```

## RuleId[id=DuplicatedCode]
### DuplicatedCode
Duplicated code
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/CmdGenerator.java`
#### Snippet
```java
    sb.append(LINE_SEPARATOR);
    boolean first = true;
    for (CommandLineArgument arg: settings.getCommandLineArguments()) {
      if(first) {
        first = false;
      }
      else {
        sb.append(' ');
      }

      sb.append(myArgumentConverter.convert(arg.getValue()));
    }
```

### DuplicatedCode
Duplicated code
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java
    final CommandLineSetup chmodCommandLineSetup = new CommandLineSetup(CHMOD_TOOL_NAME, args, Collections.<CommandLineResource>emptyList());
    try {
      final ExecResult result = myCommandLineExecutor.runProcess(chmodCommandLineSetup, EXECUTION_TIMEOUT_SECONDS);
      if(result == null) {
        return null;
      }

      return processResult(entry, result);
    }
    catch (ExecutionException e) {
      LOG.error(e);
      return new Result<AccessControlEntry, Boolean>(entry, e);
    }
```

### DuplicatedCode
Duplicated code
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java
    if(result.getExitCode() != 0) {
      final String resultStr = result.toString();
      LOG.warn(resultStr);
      return new Result<AccessControlEntry, Boolean>(entry, false);
    }

    return new Result<AccessControlEntry, Boolean>(entry, true);
```

## RuleId[id=CollectionAddAllCanBeReplacedWithConstructor]
### CollectionAddAllCanBeReplacedWithConstructor
'addAll()' call can be replaced with parametrized constructor call
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPlatformSpecificSetupBuilder.java`
#### Snippet
```java
    // Resources
    final ArrayList<CommandLineResource> resources = new ArrayList<CommandLineResource>();
    resources.addAll(commandLineSetup.getResources());

    // Settings
```

## RuleId[id=Deprecation]
### Deprecation
'CommandLineSetup(java.lang.String, java.util.List, java.util.List)' is deprecated
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LinuxFileAccessService.java`
#### Snippet
```java
    args.add(new CommandLineArgument(chmodPermissionsStr, CommandLineArgument.Type.PARAMETER));
    args.add(new CommandLineArgument(entry.getFile().getAbsolutePath(), CommandLineArgument.Type.PARAMETER));
    final CommandLineSetup chmodCommandLineSetup = new CommandLineSetup(CHMOD_TOOL_NAME, args, Collections.<CommandLineResource>emptyList());
    try {
      final ExecResult result = myCommandLineExecutor.runProcess(chmodCommandLineSetup, EXECUTION_TIMEOUT_SECONDS);
```

### Deprecation
'CommandLineSetup(java.lang.String, java.util.List, java.util.List)' is deprecated
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java
    }

    final CommandLineSetup icaclsCommandLineSetup = new CommandLineSetup(ICACLS_TOOL_NAME, args, Collections.<CommandLineResource>emptyList());
    try {
      final ExecResult result = myCommandLineExecutor.runProcess(icaclsCommandLineSetup, EXECUTION_TIMEOUT_SECONDS);
```

### Deprecation
'CommandLineSetup(java.lang.String, java.util.List, java.util.List)' is deprecated
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPlatformSpecificSetupBuilder.java`
#### Snippet
```java
    resources.add(myAccessControlResource);

    final CommandLineSetup runAsCommandLineSetup = new CommandLineSetup(
      runAsToolPath.getAbsolutePath(),
      Arrays.asList(
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/LogUtils.java`
#### Snippet
```java
    }

    return name + "{ " + value.toString() + " }";
  }

```

## RuleId[id=ArraysAsListWithZeroOrOneArgument]
### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
      final CommandLineSetup cmdLineSetup = new CommandLineSetup(
        new File(pathToRunAsPlugin, runAsToolPath).getAbsolutePath(),
        Arrays.asList(new CommandLineArgument("-t", CommandLineArgument.Type.PARAMETER)),
        Collections.<CommandLineResource>emptyList());

```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    new CommandLineSetup(ICACLS_TOOL_NAME, Collections.<CommandLineArgument>emptyList(), Collections.<CommandLineResource>emptyList());
  private static final CommandLineSetup OurChmodHelpCmdLineSetup =
    new CommandLineSetup(CHMOD_TOOL_NAME, Arrays.asList(new CommandLineArgument("--help", CommandLineArgument.Type.PARAMETER)), Collections.<CommandLineResource>emptyList());
  private static final CommandLineSetup OurSuCmdLineSetup =
    new CommandLineSetup(SU_TOOL_NAME, Arrays.asList(new CommandLineArgument("--help", CommandLineArgument.Type.PARAMETER)), Collections.<CommandLineResource>emptyList());
```

### ArraysAsListWithZeroOrOneArgument
Call to `asList()` with only one argument
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    new CommandLineSetup(CHMOD_TOOL_NAME, Arrays.asList(new CommandLineArgument("--help", CommandLineArgument.Type.PARAMETER)), Collections.<CommandLineResource>emptyList());
  private static final CommandLineSetup OurSuCmdLineSetup =
    new CommandLineSetup(SU_TOOL_NAME, Arrays.asList(new CommandLineArgument("--help", CommandLineArgument.Type.PARAMETER)), Collections.<CommandLineResource>emptyList());
  @NotNull private final ToolProvidersRegistry myToolProvidersRegistry;
  @NotNull private final BuildRunnerContextProvider myBuildRunnerContextProvider;
```

## RuleId[id=UnusedAssignment]
### UnusedAssignment
Variable `username` initializer `null` is redundant
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/WindowsFileAccessService.java`
#### Snippet
```java

    final AccessControlAccount account = entry.getAccount();
    String username = null;
    switch (account.getTargetType()) {
      case User:
```

## RuleId[id=NullableProblems]
### NullableProblems
Primitive type members cannot be annotated
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/Result.java`
#### Snippet
```java

public class Result<TContext, TValue> {
  @NotNull private final boolean myIsSuccessful;
  @NotNull private TContext myContext;
  @Nullable private TValue myValue;
```

## RuleId[id=UseBulkOperation]
### UseBulkOperation
Iteration can be replaced with bulk 'Collection.addAll()' call
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/AccessControlListProviderImpl.java`
#### Snippet
```java
    if(isAclDefaultsEnabled) {
      for (AccessControlEntry ace : getDefaultAcl(userCredentials.getUser())) {
        aceList.add(ace);
      }
    }
```

## RuleId[id=ConstantValue]
### ConstantValue
Condition `getPasswordReplacerMethod == null` is always `false`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java
    try {
      final Method getPasswordReplacerMethod = AgentRunningBuild.class.getMethod("getPasswordReplacer");
      if (getPasswordReplacerMethod == null) {
        onHidingOfPropertyIsNotSupportedMessage();
        return;
```

### ConstantValue
Condition `passwordReplacerClass == null` is always `false`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java

      final Class<?> passwordReplacerClass = Class.forName("jetbrains.buildServer.util.PasswordReplacer");
      if (passwordReplacerClass == null) {
        onHidingOfPropertyIsNotSupportedMessage();
        return;
```

### ConstantValue
Condition `addPasswordMethod == null` is always `false`
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPropertiesExtension.java`
#### Snippet
```java

      final Method addPasswordMethod = passwordReplacerClass.getMethod("addPassword", String.class);
      if (addPasswordMethod == null) {
        onHidingOfPropertyIsNotSupportedMessage();
        return;
```

## RuleId[id=FieldCanBeLocal]
### FieldCanBeLocal
Field can be converted to a local variable
in `runAs-agent/src/main/java/jetbrains/buildServer/runAs/agent/RunAsPlatformSpecificSetupBuilder.java`
#### Snippet
```java
  private final ResourceGenerator<UserCredentials> myUserCredentialsGenerator;
  private final ResourceGenerator<RunAsParams> myRunAsCmdGenerator;
  private final FileAccessService myFileAccessService;
  private final RunAsLogger myRunAsLogger;
  private final RunAsAccessService myRunAsAccessService;
```

