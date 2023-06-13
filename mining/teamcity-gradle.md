# teamcity-gradle 
 
# Bad smells
I found 8 bad smells with 1 repairable:
| ruleID | number | fixable |
| --- | --- | --- |
| UNUSED_IMPORT | 3 | false |
| SpringBeanConstructorArgInspection | 2 | false |
| SpringXmlAutowireExplicitlyInspection | 2 | false |
| UnnecessaryToStringCall | 1 | true |
## RuleId[id=SpringBeanConstructorArgInspection]
### SpringBeanConstructorArgInspection
No matching constructor found in class 'GradleToolProvider'#treeend

*** ** * ** ***

|---------------------------------------------|---|-----------|
| **GradleToolProvider(...):**                |   | **Bean:** |
| ToolProvidersRegistry toolProvidersRegistry |   | **???**   |
| BundledToolsRegistry bundled                |   | **???**   |
in `gradle-runner-agent/src/main/resources/META-INF/build-agent-plugin-gradle-runner.xml`
#### Snippet
```java

  <bean id="gradleRunnerServiceFactory" class="jetbrains.buildServer.gradle.agent.GradleRunnerServiceFactory"/>
  <bean id="gradleToolProvider" class="jetbrains.buildServer.gradle.agent.GradleToolProvider" autowire="constructor"/>

</beans>
```

### SpringBeanConstructorArgInspection
No matching constructor found in class 'GradleRunType'#treeend

*** ** * ** ***

|-----------------------------------|---|-----------|
| **GradleRunType(...):**           |   | **Bean:** |
| RunTypeRegistry runTypeRegistry   |   | **???**   |
| PluginDescriptor pluginDescriptor |   | **???**   |
in `gradle-runner-server/src/main/resources/META-INF/build-server-plugin-gradle-runner.xml`
#### Snippet
```java
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
  <bean id="gradleRunType" class="jetbrains.buildServer.gradle.server.GradleRunType"/>
  <bean class="jetbrains.buildServer.gradle.server.GradleProblemTypeDetailsProvider"/>
  <bean class="jetbrains.buildServer.gradle.server.GradleRunnerDiscoveryExtension"/>
```

## RuleId[id=SpringXmlAutowireExplicitlyInspection]
### SpringXmlAutowireExplicitlyInspection
Unnecessary autowired dependency
in `gradle-runner-agent/src/main/resources/META-INF/build-agent-plugin-gradle-runner.xml`
#### Snippet
```java

  <bean id="gradleRunnerServiceFactory" class="jetbrains.buildServer.gradle.agent.GradleRunnerServiceFactory"/>
  <bean id="gradleToolProvider" class="jetbrains.buildServer.gradle.agent.GradleToolProvider" autowire="constructor"/>

</beans>
```

### SpringXmlAutowireExplicitlyInspection
Make autowired dependency explicit
in `gradle-runner-server/src/main/resources/META-INF/build-server-plugin-gradle-runner.xml`
#### Snippet
```java
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-3.0.xsd"
           default-autowire="constructor">
  <bean id="gradleRunType" class="jetbrains.buildServer.gradle.server.GradleRunType"/>
  <bean class="jetbrains.buildServer.gradle.server.GradleProblemTypeDetailsProvider"/>
```

## RuleId[id=UNUSED_IMPORT]
### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.ComparisonFailureUtil;`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
import java.io.IOException;
import java.util.*;
import jetbrains.buildServer.ComparisonFailureUtil;
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.AgentRuntimeProperties;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.agent.ClasspathUtil;`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
import jetbrains.buildServer.RunBuildException;
import jetbrains.buildServer.agent.AgentRuntimeProperties;
import jetbrains.buildServer.agent.ClasspathUtil;
import jetbrains.buildServer.agent.IncrementalBuild;
import jetbrains.buildServer.agent.ToolCannotBeFoundException;
```

### UNUSED_IMPORT
Unused import `import jetbrains.buildServer.messages.serviceMessages.ServiceMessage;`
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
import jetbrains.buildServer.log.Loggers;
import jetbrains.buildServer.messages.ErrorData;
import jetbrains.buildServer.messages.serviceMessages.ServiceMessage;
import jetbrains.buildServer.runner.JavaRunnerConstants;
import jetbrains.buildServer.serverSide.BuildTypeOptions;
```

## RuleId[id=UnnecessaryToStringCall]
### UnnecessaryToStringCall
Unnecessary `toString()` call
in `gradle-runner-agent/src/main/java/jetbrains/buildServer/gradle/agent/GradleRunnerService.java`
#### Snippet
```java
      return s + " \"-Djava.io.tmpdir=" + tempDir.getCanonicalPath() +"\"";
    } catch (IOException e) {
      Loggers.AGENT.warnAndDebugDetails("Failed patch temp dir for Gradle runtime environment: " + e.toString(), e);
      return s;
    }
```

